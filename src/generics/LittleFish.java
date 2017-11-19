package generics;

/**
 * @author zhan
 * Created on 2017/11/18  16:16
 */
public class LittleFish {
    private static Integer count = 0;
    private Integer temp = count++;

    //构造器私有，强制使用generator
    private LittleFish(){}

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }

    @Override
    public String toString() {
        return "LittleFish{" +
                "count=" + temp +
                '}';
    }
}
