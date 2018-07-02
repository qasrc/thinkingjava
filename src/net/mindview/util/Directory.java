package net.mindview.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Directory {

    /**
     * list appoint file
     *
     * @param file
     * @param regex
     * @return
     */
    public static File[] local(File file, String regex) {
        return file.listFiles((dir, name) -> {
            Pattern pattern = Pattern.compile(regex);
            return pattern.matcher(name).matches();
        });
    }


    /**
     * override local
     *
     * @param path  the file of the path
     * @param regex regex
     * @return
     */
    public static File[] local(String path, String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        public List<File> dirs = new ArrayList<>();
        public List<File> files = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return dirs.iterator();
        }

        void addAll(TreeInfo others) {
            dirs.addAll(others.dirs);
            files.addAll(others.files);
        }

        @Override
        public String toString() {
            return "dirs:" + PPrint.pformat(dirs) +
                    "\n files:" + PPrint.pformat(files);
        }
    }

    public static TreeInfo walk(String path, String regex) {
        return recursion(new File(path), regex);
    }

    public static TreeInfo walk(File file, String regex) {
        return recursion(file, regex);
    }

    public static TreeInfo walk(String path) {
        return recursion(new File(path), ".*");
    }

    public static TreeInfo walk(File file) {
        return recursion(file, ".*");
    }

    public static TreeInfo recursion(File file, String regex) {
        TreeInfo treeInfo = new TreeInfo();
        for (File file1 : file.listFiles()) {
            if (file1.isDirectory()) {
                treeInfo.dirs.add(file1);
                treeInfo.addAll(recursion(file1, regex));
            } else {
                if (file1.getName().matches(regex)) {
                    treeInfo.files.add(file1);
                }
            }
        }

        return treeInfo;
    }


    //simple validation test
    public static void main(String[] args) {
        TreeInfo treeInfo = walk("/usr");
        System.out.println(treeInfo.toString());
    }
}
