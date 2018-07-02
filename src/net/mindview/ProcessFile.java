package net.mindview;

import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;

public class ProcessFile {
    interface Strategy{
        void process(File file);
    }

    private Long size=0L;

    private Strategy strategy;
    private String ext;

    public ProcessFile(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start(String[] args) throws IOException {
        if (args.length==0) {
            processDirectory(new File("."));
        }else{
            for (String arg : args) {
                File file = new File(arg);
                if (file.isDirectory()) {
                    processDirectory(file);
                }else {
                    if (file.getName().matches(ext)) {
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ProcessFile processFile = new ProcessFile(System.out::println,"java");
        processFile.start(args);
        System.out.println("所有文件的和为："+processFile.size);
    }

    public void processDirectory(File file){
        for (File file1 : Directory.walk(file.getAbsolutePath(), ext).files) {
            strategy.process(file1);
            size+=file1.getTotalSpace();
        }
    }
}
