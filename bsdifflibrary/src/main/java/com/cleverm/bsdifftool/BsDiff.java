package com.cleverm.bsdifftool;

/**
 * Created by ricky on 2018/4/10.
 */

public class BsDiff {
    static {
        System.loadLibrary("bsdiff");
    }

    /**
     *
     * @param oldPath 旧apk文件路径
     * @param newPath 新apk文件路径
     * @param diffPath 生成的patch文件放置的路径
     * @return  返回0代表成功
     */
    public static native int bsdiff(String oldPath, String newPath, String diffPath);
}
