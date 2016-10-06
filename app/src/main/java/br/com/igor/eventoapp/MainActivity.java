package br.com.igor.eventoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] arrayAulas = getResources().getStringArray(R.array.array_aulas);

        ListView lista = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayAulas);

        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                Bundle bundle = new Bundle();
                String aula = arrayAulas[position];
                bundle.putString("AULA", aula);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
