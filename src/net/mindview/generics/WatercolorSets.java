package net.mindview.generics;

import net.mindview.generics.watercolors.Watercolors;
import net.mindview.util.Sets;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author zhan
 * Created on 2017/11/15  22:04
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.WHITE, Watercolors.ROSE);

        Set<Watercolors> set2 = EnumSet.range(Watercolors.YELLOW, Watercolors.BLUE);

        System.out.println("main-------->set1:" + set1);
        System.out.println("main-------->set2:" + set2);
        System.out.println(Sets.complement(set1, set2));
        System.out.println(Sets.intersection(set1, set2));
    }
}
