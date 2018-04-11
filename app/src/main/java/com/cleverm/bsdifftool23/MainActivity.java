package com.cleverm.bsdifftool23;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cleverm.bsdifftool.BsDiff;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String oldPath =
                Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator +
                "old.apk";
        final String newPath =
                Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator +
                "new.apk";
        final String diffPath =
                Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator +
                "diff.patch";

        findViewById(R.id.btn_diff).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsDiff.bsdiff(oldPath, newPath, diffPath);
            }
        });
    }
}
