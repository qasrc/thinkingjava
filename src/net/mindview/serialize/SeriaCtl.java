package net.mindview.serialize;

import java.io.*;
import java.util.Arrays;

/**
 * @author zhangzhan
 * @date 2018/7/21 2:13 PM
 */
public class SeriaCtl implements Serializable {
    private String name;
    private transient String password;

    public SeriaCtl(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SeriaCtl{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        System.out.println("my writeObject");
        stream.defaultWriteObject();
        stream.writeObject(password);
    }

    private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException {
        System.out.println("my readObject");
        stream.defaultReadObject();
        password = (String) stream.readObject();
    }

    public static void main(String[] args) throws Exception{
        SeriaCtl seriaCtl = new SeriaCtl("zhang", "123");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(seriaCtl);
        System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        SeriaCtl result = (SeriaCtl) objectInputStream.readObject();
        System.out.println(result);
    }


}
