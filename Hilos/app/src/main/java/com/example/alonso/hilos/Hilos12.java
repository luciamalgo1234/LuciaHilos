package com.example.alonso.hilos;

import android.widget.TextView;


import com.example.alonso.hilos.AsyncTask;

import org.w3c.dom.Text;

import java.util.Random;

/**
 * Created by Alonso on 24/04/2017.0
 */

public class Hilos12 extends android.os.AsyncTask<Void, Void, String> {
    TextView mTextView;
    public Hilos12(TextView tv) {
        mTextView = tv;
    }

    @Override
    protected String doInBackground(Void... params) {

        Random r = new Random();
        int n = r.nextInt(11);
        int s = n * 200;

        try {
            Thread.sleep(200);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        return "Awake at last after sleeping for " + s + "milliseconds!";
    }

    protected void onPostExcecute(String result ) {
        mTextView.setText("Hola");

    }

}
