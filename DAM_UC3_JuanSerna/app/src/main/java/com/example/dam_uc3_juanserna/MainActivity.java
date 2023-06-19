package com.example.dam_uc3_juanserna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinnerdia;
    private Spinner spinnermes;
    private Spinner spinneranio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinnerSexo);
        String[] opciones = {"Masculino","Femenino"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);

        spinnerdia = (Spinner) findViewById(R.id.spinnerDia);
        String[] opcionesdia = {"1","2","3","4","5","6","7","8","9"};
        ArrayAdapter <String> adapterdia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcionesdia);
        spinnerdia.setAdapter(adapterdia);

        spinnermes = (Spinner) findViewById(R.id.spinnerMes);
        String[] opcionesmes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
                "Octubre","Noviembre","Diciembre"};
        ArrayAdapter <String> adaptermes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcionesmes);
        spinnermes.setAdapter(adaptermes);

        spinneranio = (Spinner) findViewById(R.id.spinnerAnio);
        String[] opcionesanio = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992",
                "1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006",
                "2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2021","2022",};
        ArrayAdapter <String> adapteranio = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcionesanio);
        spinneranio.setAdapter(adapteranio);

        //Evento boton Registrar
        Button btn1 = findViewById(R.id.buttonRegistrar);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Se envio sus datos", Toast.LENGTH_LONG).show());

        //Evento boton Entrar
        Button btn2 = findViewById(R.id.button_Entrar);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Bienvenido a Facebook", Toast.LENGTH_LONG).show());






    }
}