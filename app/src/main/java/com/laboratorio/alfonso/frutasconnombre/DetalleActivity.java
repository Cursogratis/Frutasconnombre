package com.laboratorio.alfonso.frutasconnombre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView foto;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto = (ImageView) findViewById(R.id.imgFoto);
        titulo = (TextView) findViewById(R.id.textTitulo);

        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");

        Log.e("detalle ", String.valueOf(obj));

        if(obj.getImagen() != 0 && obj.getTitulo() != null) {

            titulo.setText(obj.getTitulo());

            Log.e("imagen", String.valueOf((obj.getImagen())));

            foto.setImageResource(obj.getImagen());
        }
    }
}
