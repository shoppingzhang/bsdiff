package com.cleverm.bsdifftool;

/**
 * Created by ricky on 2018/4/10.
 */

public class BsDiff {
    static {
        System.loadLibrary("bsdiff");
    }

    public static native int bsdiff(String oldPath, String newPath, String diffPath);
}
