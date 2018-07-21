package net.mindview.io;

import java.io.*;

/**
 * @author zhangzhan
 * @date 2018/7/20 下午10:25
 */
public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersonSerialize personSerialize = new PersonSerialize("tom", "zhangzhan");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/object.out"));
        objectOutputStream.writeObject(personSerialize);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/object.out"));
        PersonSerialize result = (PersonSerialize) objectInputStream.readObject();
        System.out.println(result);
    }
}
