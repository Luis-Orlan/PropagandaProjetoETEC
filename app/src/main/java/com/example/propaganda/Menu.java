package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnSobreP = (Button) findViewById(R.id.btnSobre);

        btnSobreP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Sobre.class);
                startActivity(it);
            }
        });

        Button btnTelefoneP = (Button) findViewById(R.id.btnTel);

        btnTelefoneP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Telefone.class);
                startActivity(it);
            }
        });
    }
}