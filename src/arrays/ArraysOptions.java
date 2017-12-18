package arrays;

/**
 * @author zhan
 * Created on 2017/12/17  15:20
 */
public class ArraysOptions {
    static void test(BerylliumSphere[] berylliumSpheres) {
        System.out.println(berylliumSpheres);
    }

    public static void main(String[] args) {
        test(new BerylliumSphere[2]);
        test(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
        //test({new BerylliumSphere()});

    }

}

class BerylliumSphere{}
