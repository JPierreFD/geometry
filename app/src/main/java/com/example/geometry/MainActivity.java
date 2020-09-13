package com.example.geometry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btLimpar, btCalcular;
    EditText etBase, etAltura, etArea;
    TextView  tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBase = findViewById(R.id.etBase);
        etAltura = findViewById(R.id.etAltura);
        etArea = findViewById(R.id.etArea);
        btLimpar = findViewById(R.id.btLimpar);
        btCalcular = findViewById(R.id.btCalcular);
        tvMensagem = findViewById(R.id.tvMensagem);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double base = Double.parseDouble(etBase.getText().toString());
                    double altura = Double.parseDouble(etAltura.getText().toString());
                    double area = base * altura;
                    etArea.setText(String.valueOf(area + " u.m."));
                }catch (NumberFormatException erro){
                    etArea.setHint("Informe base e altura!");
                    etArea.setHint("");
                }

            }
        });
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etBase.setText("");
                etAltura.setText("");
                etArea.setText("");
            }
        });
    }
    
}