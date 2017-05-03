package com.example.alonso.hilos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AsyncTask extends AppCompatActivity{


    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        mTextView = (TextView)findViewById(R.id.texto);
    }


    public void starttask(View view) {
        mTextView.setText("Napping..." );

        new Hilos12((TextView) view).execute();

    }
}
