package com.example.bonilla.seccion_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> names;

    public MyAdapter(Context context, int layout, List<String> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {
        return this.names.size();
    } // La lista que va a dibujar  o mostrar.

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        //View Holder Pattern.
        ViewHolder holder;

        if(convertView == null){
            // Toma un diseño xml como entrada (por ejemplo) y lo convierte en Ver objeto.
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(R.layout.list_item, null);

            holder = new ViewHolder();

            // Llamamos el TextView del activity list_item y le pasamos los valores a mostrar
            holder.nameTextView= (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }


        //Nos traemos el valor actual del array.
        String currentName = names.get(position);
        //currentName = (String) getItem(position);

        holder.nameTextView.setText(currentName);

        //Devolvemos la vista ya modificada.
        return convertView;
    }
    static class ViewHolder{
        private TextView nameTextView;

    }
}
