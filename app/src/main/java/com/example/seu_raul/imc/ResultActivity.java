package com.example.seu_raul.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultadoLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultadoLabel = (TextView) findViewById(R.id.textResult);
        String resultado = getIntent().getStringExtra("textoIMC");
        resultadoLabel.setText(resultado);
    }
}
