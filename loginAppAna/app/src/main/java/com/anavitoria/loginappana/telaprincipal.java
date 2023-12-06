package com.anavitoria.loginappana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaprincipal extends AppCompatActivity {



        Button btnSair;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_telaprincipal);

            btnSair = findViewById(R.id.btnSair);
            btnSair.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Loginxctivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}