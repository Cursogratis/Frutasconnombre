package com.laboratorio.alfonso.frutasconnombre;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> ListaObjetos;

   static class ViewHolder{
        private ImageView imagen;
        private TextView titulo;
    /*
        public ViewHolder(View vista){
            ImageView imagen = (ImageView) vista.findViewById(R.id.imageView);
            TextView titulo = (TextView) vista.findViewById(R.id.textview);
        }
        */

   }

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); //retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        //View vista = convertView;

        if( convertView == null){
            Log.e("vista:", String.valueOf(convertView));
            LayoutInflater inflate = LayoutInflater.from(contexto);
            convertView = inflate.inflate(R.layout.lista_frutas, null);
            holder = new ViewHolder();
            holder.imagen = (ImageView) convertView.findViewById(R.id.imageView);
            holder.titulo = (TextView) convertView.findViewById(R.id.textview);
            Log.e("entrada", String.valueOf(holder));
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        Datos objeto = ListaObjetos.get(position);


        Log.e("titulo", String.valueOf(objeto.getTitulo()));
        Log.e("holder titulo", String.valueOf((holder.titulo)));

        holder.imagen.setImageResource(objeto.getImagen());
        holder.titulo.setText(objeto.getTitulo());

        return convertView;
   }
}
