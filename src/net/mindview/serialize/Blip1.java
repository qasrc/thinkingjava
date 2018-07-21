package net.mindview.serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author zhangzhan
 * @date 2018/7/21 上午9:46
 */
public class Blip1 implements Externalizable {
    public Blip1() {
        System.out.println("Blip1 Constructor");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip1 writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip1 readExternal");
    }
}
