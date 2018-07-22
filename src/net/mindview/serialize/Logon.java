package net.mindview.serialize;

import java.io.*;
import java.util.Date;

/**
 * @author zhangzhan
 * @date 2018/7/21 10:59 AM
 */
public class Logon implements Serializable {
    private Date date;
    private String username;
    private static String flag;
    private transient String password;

    public Logon(String username, String password) {
        flag = "hello world";
        date = new Date();
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Logon{" +
                "date=" + date +
                ",flag=" + flag+
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception{
        Logon logon = new Logon("zhangzhan", "123456");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/logon.out"));
        System.out.println("save object");
        System.out.println(logon);
        Logon.serializeStaticStatue(objectOutputStream);
        objectOutputStream.writeObject(logon);

    }

    public static void serializeStaticStatue(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeObject(flag);
    }

    public static void deSerializeStaticStatue(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        flag = (String) inputStream.readObject();
    }
}
