package testFile;

import java.io.File;

/**
 * @使用递归，把某个文件夹下的所有文件都展示出来
 */

public class FileList {
    public static void main(String[] args) {
        File f = new File("E:/testA");
        System.out.println(f);
        tree(f, 1);
    }

    private static void tree(File file, int level) {
        File[] childs = file.listFiles();
        String preStr = "";

        for (int i = 0; i < level; i++) {
            preStr += " ";
        }

        for (int i = 0; i < childs.length; i++) {
            System.out.println(preStr + childs[i].getName());

            if (childs[i].isDirectory())
                tree(childs[i], level + 1);
        }
    }
}
