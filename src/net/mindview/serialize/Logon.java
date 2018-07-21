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
    private transient String password;

    public Logon(String username, String password) {
        date = new Date();
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Logon{" +
                "date=" + date +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception{
        Logon logon = new Logon("zhangzhan", "123456");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/logon.out"));
        System.out.println("save object");
        System.out.println(logon);
        objectOutputStream.writeObject(logon);
        System.out.println("delay......");
        Thread.sleep(2000);
        System.out.println("recover object");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/logon.out"));
        Logon result = (Logon) objectInputStream.readObject();
        System.out.println(result);
    }
}
