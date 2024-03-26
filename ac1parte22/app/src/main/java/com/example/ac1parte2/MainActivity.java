package com.example.ac1parte2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button pdaButton = findViewById(R.id.pda);
        Button fazendaButton = findViewById(R.id.fazenda);
        Button jardimBotanicoButton = findViewById(R.id.jardimbotanico);


        pdaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainPDA.class);
                startActivity(intent);
            }
        });

        fazendaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainFazenda.class);
                startActivity(intent);
            }
        });

        jardimBotanicoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainJardim.class);
                startActivity(intent);
            }
        });
    }
}