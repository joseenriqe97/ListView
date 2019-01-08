package com.example.bonilla.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //Datos a mostrar
        names = new ArrayList<String>();
        names.add("Jose Enrique");
        names.add("Pedro");
        names.add("Juan");
        names.add("Felipe");
        names.add("Jose Enrique");
        names.add("Pedro");
        names.add("Juan");
        names.add("Felipe");
        names.add("Jose Enrique");
        names.add("Pedro");
        names.add("Juan");
        names.add("Felipe");
        names.add("Jose Enrique");
        names.add("Pedro");
        names.add("Juan");
        names.add("Felipe");
        names.add("Jose Enrique");
        names.add("Pedro");
        names.add("Juan");
        names.add("Felipe");
        names.add("Jose Enrique");
        names.add("Pedro");
        names.add("Juan");
        names.add("Felipe");



       //Adaptador, la forma visual en que mostraremos los datos.
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names); //Se le pasa el layaout que queremo que renderice en la vista.

        //Enlazamos el adaptador con nuestro listView.
        // listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Your name is " + names.get(position   ), Toast.LENGTH_LONG).show();
            }
        });
sss
        //Enlazamos con nuestro adaptador.
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listView.setAdapter(myAdapter);
    }
}

