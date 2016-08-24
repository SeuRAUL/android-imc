package com.example.seu_raul.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pesoText, alturaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pesoText = (EditText) findViewById(R.id.pesoText);
        alturaText = (EditText) findViewById(R.id.alturaText);
    }

    public void calculeIMC(View view) {
        double peso = Double.parseDouble(pesoText.getText().toString());
        double altura = Double.parseDouble(alturaText.getText().toString());

        double resultado = peso/(Math.pow(altura, 2));

        Intent i = new Intent(MainActivity.this, ResultActivity.class);
        i.putExtra("textoIMC", "Seu IMC é:\n" + resultado);

        startActivity(i);
    }
}
