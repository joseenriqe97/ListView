package com.example.bonilla.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    private GridView gridView;
    private List<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.gridView);

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


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridActivity.this, "Your name is " + names.get(position   ), Toast.LENGTH_LONG).show();
            }
        });
        //Enlazamos con nuestro adaptador.
        MyAdapter myAdapter = new MyAdapter(this, R.layout.grid_item, names);
        gridView.setAdapter(myAdapter);
    }
}
