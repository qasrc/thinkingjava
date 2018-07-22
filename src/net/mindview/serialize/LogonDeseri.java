package net.mindview.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author zhangzhan
 * @date 2018/7/22 9:25 AM
 */
public class LogonDeseri {
    public static void main(String[] args) throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/logon.out"));
        Logon.deSerializeStaticStatue(objectInputStream);
        Logon result = (Logon) objectInputStream.readObject();
        System.out.println(result);
    }
}
