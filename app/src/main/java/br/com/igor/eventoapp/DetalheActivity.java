package br.com.igor.eventoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String aula = bundle.getString("AULA");

        TextView descricao = (TextView) findViewById(R.id.descricao);
        descricao.setText(aula);
    }
}
