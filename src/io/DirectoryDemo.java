package io;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").files);
        System.out.println("========================");
        PPrint.pprint(Directory.walk(".","\\D+.java").files);
    }
}
