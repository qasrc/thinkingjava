package net.mindview.generics;

import java.util.*;

/**
 * @author zhan
 * Created on 2017/11/18  16:19
 */
public class BackBigFish {
    public static void print(LittleFish littleFish, BigFish bigFish) {
        System.out.println(bigFish + " eat " + littleFish);
    }

    public static void main(String[] args) {
        Queue<LittleFish> littleFishQueue = new LinkedList<>();
        Generators.fill(littleFishQueue, LittleFish.generator(), 10);
        List<BigFish> bigFishList = new ArrayList<>();
        Generators.fill(bigFishList, BigFish.generator(), 10);
        Random random = new Random(47);
        for (LittleFish littleFish : littleFishQueue) {
            print(littleFish,bigFishList.get(random.nextInt(bigFishList.size())));
        }
    }
}
