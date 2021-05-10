package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telefone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);

        Button btnVoltarTelP = (Button) findViewById(R.id.btnVoltarTel);

        btnVoltarTelP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent( Telefone.this, Menu.class);
                startActivity(it);
            }
        });
    }
}