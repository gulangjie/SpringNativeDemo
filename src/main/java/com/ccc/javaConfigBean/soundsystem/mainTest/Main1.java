package main.java.com.ccc.javaConfigBean.soundsystem.mainTest;

import redis.clients.jedis.Jedis;

import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        try {
            Jedis jedis = new Jedis();
            Map<String, String> map = jedis.hgetAll("event");
            System.out.println(map);
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
