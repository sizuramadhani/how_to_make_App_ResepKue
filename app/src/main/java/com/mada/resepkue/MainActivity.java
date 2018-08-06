package com.mada.resepkue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bkering = (Button) findViewById(R.id.btnkuekering);
        bkering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), kuekering.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });

        final Button bbasah = (Button) findViewById(R.id.btnkuebasah);
        bbasah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), kuebasah.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }

        });

    }
}

