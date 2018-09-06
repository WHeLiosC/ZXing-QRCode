package util;

import java.io.File;

public class FileUtil {
    /**
     * TODO 判断指定路径是否存在，不存在则生成该路径
     * @param dir 给定路径
     */
    public static void mkdirs(String dir) {
        File file = new File(dir);
        if (file.isDirectory())
            return;
        else
            file.mkdirs();
    }
}
