package com.example.marinelesigne.explicitintent;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //relation with our activity principal

        //Initialisation
        submitBtn = findViewById(R.id.submitBtn); //relation avec elements dans activity principal
        nameEditText = findViewById(R.id.nameEditText); //idem
        //fin initialisation


        //lien entre bouton et 2nd activity

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //migrer vers activity_second
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);

                //pass data + bundle object
                Bundle b = new Bundle();

                b.putString("name", nameEditText.getText().toString());
                b.putInt("age", 23);

                intent.putExtras(b);
                //fin pass data

                startActivity(intent);
                //fin migration



            }
        });

    }
}
