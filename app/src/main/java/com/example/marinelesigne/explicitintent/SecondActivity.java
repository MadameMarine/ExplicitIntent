package com.example.marinelesigne.explicitintent;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class SecondActivity  extends AppCompatActivity{

    private static final String TAG = SecondActivity.class.getSimpleName();

    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_second); //relation with our activity

        textView = findViewById(R.id.textView);

        //pass data
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String  name = bundle.getString("name", "DefaultName");
        Log.i(TAG, "Name :" + name);

        int age = bundle.getInt("age", 23);
        Log.i(TAG, "Age :" + age);



    }
}




