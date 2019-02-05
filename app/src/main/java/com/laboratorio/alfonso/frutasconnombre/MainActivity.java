package com.laboratorio.alfonso.frutasconnombre;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;

    ArrayList<Datos> Lista;

   // int [] progImagines = {R.drawable.banana,R.drawable.coco,R.drawable.manzana,R.drawable.sandia,R.drawable.uva};
    //String [] progNombreLista = {"BANANA","COCO","MANZANA","PERA","SANDIA","UVA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listaDatos = (ListView) findViewById(R.id.lvListado);

        Lista = new ArrayList<Datos>();

        Lista.add(new Datos(1,"BANANA",R.drawable.web_hi_res_512));
        Lista.add(new Datos(2,"COCO",R.drawable.coco));
        Lista.add(new Datos(3,"MANZANA",R.drawable.manzana));
        Lista.add(new Datos(4,"PERA",R.drawable.pera));
        Lista.add(new Datos(5,"SANDIA",R.drawable.sandia));
        Lista.add(new Datos(5,"UVA",R.drawable.image_preview));
        Log.e("lista", String.valueOf((Lista)));
        Adapter miadaptador = new Adaptador(getApplicationContext(),Lista);

        listaDatos.setAdapter((ListAdapter) miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj = (Datos) parent.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), "Seleccionaste "+ obj, Toast.LENGTH_LONG).show();
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable) obj);

                Log.e("objeto mandado", String.valueOf(obj));
                Log.e("posicion", String.valueOf(position));
                Log.e("Lista", String.valueOf(Lista));
                startActivity(paso);
            }
        });
    }
}
