package net.mindview.serialize;

import java.io.*;

/**
 * @author zhangzhan
 * @date 2018/7/21 上午10:23
 */
public class Blip3 implements Externalizable {

    private int i;
    private String s;

    public Blip3() {
        System.out.println("Blip3 Constructor");
    }

    public Blip3(int i, String s) {
        System.out.println("Blip3(int i,String s)");
        this.i = i;
        this.s = s;
    }

    @Override
    public String toString() {
        return "Blip3{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip3 writeExternal");
        //must do this
        out.writeInt(i);
        out.writeObject(s);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip3 readExternal");
        //must do this
        i = in.readInt();
        s = (String) in.readObject();
    }

    public static void main(String[] args) throws Exception{
        System.out.println("save object");
        Blip3 blip3 = new Blip3(26, "zhangzhan");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/Blip3.out"));
        objectOutputStream.writeObject(blip3);
        System.out.println("read object");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/Blip3.out"));
        Blip3 back = (Blip3) objectInputStream.readObject();
        System.out.println(back);
    }

}
