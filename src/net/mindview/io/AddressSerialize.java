package net.mindview.io;

import java.io.Serializable;

/**
 * @author zhangzhan
 * @date 2018/7/20 下午10:24
 */
public class AddressSerialize implements Serializable {
    private String desc;

    public AddressSerialize(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
