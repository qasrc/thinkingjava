package generics;

import java.util.*;

/**
 * @author zhan
 * Created on 2017/11/18  21:37
 */
public class LastInfomation {
    public static void main(String[] args) {
        List<Frob> frobs = new ArrayList<>();
        System.out.println(Arrays.toString(frobs.getClass().getTypeParameters()));
        Map<Frob, Fnorkle> map = new HashMap<>();
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        Quark<Frob> frobQuark = new Quark<>();
        System.out.println(Arrays.toString(frobQuark.getClass().getTypeParameters()));
        Particle<Frob, Fnorkle> particle = new Particle<>();
        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));

    }
}

class Frob{}

class Fnorkle{}

class  Quark<Q>{}

class Particle<POSITION,MOMENTUM>{}
