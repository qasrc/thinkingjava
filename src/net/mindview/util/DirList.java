package net.mindview.util;

import java.io.File;
import java.util.regex.Pattern;

public class DirList {

    /**
     * 根据正则表达式列出指定路径下的所有文件
     * @param regex 正则表达式
     * @param path 文件路径
     * @return 文件名数组
     */
    public static String[] listDir(String regex,String path){
        File file = new File(path);
        return file.list((dir,filename)->{
            Pattern pattern = Pattern.compile(regex);
            return pattern.matcher(filename).matches();
        });
    }

}
