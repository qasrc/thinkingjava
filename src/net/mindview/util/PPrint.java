package net.mindview.util;

import java.util.Arrays;
import java.util.Collection;

public class PPrint {
    public static String pformat(Collection<?> collection) {
        if (collection.size()==0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (Object o : collection) {
            if (collection.size()>1) {
                result.append("\n");
            }
            result.append(o);
        }
        if (collection.size()>1) {
            result.append("\n");
        }
        result.append("]");
        return result.toString();
    }

    public static void pprint(Object[] objects) {
        System.out.println(pformat(Arrays.asList(objects)));
    }

    public static void pprint(Collection<?> collection) {
        System.out.println(pformat(collection));
    }
}
