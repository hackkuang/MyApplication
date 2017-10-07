package com.example.hackkuang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviw2(1,2,3);
        Log.i(TAG, "onCreate: ");
    }

    /**
     *
     * @param i
     * @param i1
     * @param i2
     */
    private void initviw2(int i, int i1, int i2) {
        List<String> list = new ArrayList<>();
        for (String s : list) {

        }
        int a = 0;
        int b = 1;
        for (int i3=0;i3< 10;i3++){

          a++;
          b--;
        }
    }

}
