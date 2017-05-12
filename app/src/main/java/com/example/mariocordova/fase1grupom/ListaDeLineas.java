package com.example.mariocordova.fase1grupom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ListaDeLineas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_lineas);


        Toast.makeText(this,"entróoooo",Toast.LENGTH_LONG).show();
    }

    /*
    public void verRuta(View view)
    {
        EditText edtLinea = (EditText) findViewById(R.id.etlinea);
        String linea = edtLinea.getText().toString();

        if(linea!= null || linea!=="")
        {
            Toast.makeText(this, "Buscando", Toast.LENGTH_LONG).show();
        }
    }
    */
}
