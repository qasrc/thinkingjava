package net.mindview.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author zhangzhan
 * @date 2018/7/20 下午6:12
 */
public class JeisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("Jedis is running:"+jedis.ping());
    }

    private static void setObject(Object o) {
        
    }
    
    
}
