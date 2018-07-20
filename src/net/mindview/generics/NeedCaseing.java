package net.mindview.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/11/28  22:22
 */
public class NeedCaseing {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(args[0]));
        //List<String> strings = (List<String>) objectInputStream.readObject();
        List strings = List.class.cast(objectInputStream.readObject());
    }
}
