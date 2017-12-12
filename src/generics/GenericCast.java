package generics;

/**
 * @author zhan
 * Created on 2017/12/01  22:42
 */
public class GenericCast {
    public static void main(String[] args) {
        FixedSizeStack<String> fixedSizeStack = new FixedSizeStack<>();
        String[] strings = "A b c d e h r g".split(" ");
        for (String string : strings) {
            fixedSizeStack.push(string);
        }

        for (int i = 0; i < strings.length-1; i++) {
            System.out.println(fixedSizeStack.pop());
        }
    }
}
