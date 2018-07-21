package net.mindview.io;

import java.io.Serializable;

/**
 * @author zhangzhan
 * @date 2018/7/20 下午10:24
 */
public class PersonSerialize implements Serializable {
    private AddressSerialize addressSerialize;
    private String name;
    private String desc;

    public PersonSerialize(String name, String desc) {
        this.name = name;
        this.desc = desc;
        addressSerialize = new AddressSerialize(desc);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PersonSerialize{" +
                "addressSerialize=" + addressSerialize +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
