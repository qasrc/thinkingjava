package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/11/20  20:54
 */
public class Face implements Eye,Mouse {
    @Override
    public void see() {
        System.out.println("eye see");
    }

    @Override
    public void smell() {
        System.out.println("mouse smell");
    }

    public <T extends Eye> void anySee(T t){
        t.see();
    }

    public <T extends Mouse> void anySmell(T t) {
        t.smell();
    }

    public static void main(String[] args) {
        Face face = new Face();
        face.anySee(face);
        face.anySmell(face);
    }

    @Test
    public void test(){
        Number[] numbers1 = new Number[10];
        Number[] numbers = new Integer[10];
        numbers[0] = 123;
        numbers1[0] = 343.1;
    }

    @Test
    public void tset1(){
        List<? extends Number> numbers = new ArrayList<>();
        Integer i = 10;
        Number number = 10;
    }
}
