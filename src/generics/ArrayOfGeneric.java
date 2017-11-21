package generics;

/**
 * @author zhan
 * Created on 2017/11/19  19:27
 */
public class ArrayOfGeneric {
    static Generic<Integer>[] gia = new Generic[20];

    public static void main(String[] args) {
        System.out.println(gia);
    }

}

class Generic<T>{}
