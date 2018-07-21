package net.mindview.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zhangzhan
 * @date 2018/7/21 上午9:49
 */
public class BlipCheck {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/blip.file"));
        System.out.println("save object");
        Blip1 blip1 = new Blip1();
        BlipCheck blip2 = new BlipCheck();
        objectOutputStream.writeObject(blip1);
        objectOutputStream.writeObject(blip2);
        objectOutputStream.close();
        System.out.println("-----------------------");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/blip.file"));
        System.out.println("read object");
        Blip1 result = (Blip1) objectInputStream.readObject();
        System.out.println(result);
        BlipCheck result1 = (BlipCheck) objectInputStream.readObject();
        System.out.println(result1);
        objectInputStream.close();
    }
}
