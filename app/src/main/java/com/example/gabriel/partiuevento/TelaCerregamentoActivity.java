package com.example.gabriel.partiuevento;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class TelaCerregamentoActivity extends AppCompatActivity {

    private static int TEMPO_SPLASH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cerregamento);


        new Handler().postDelayed(new Runnable() {
            //Carrega a imagem LOGO
            @Override
            public void run() {
                // Este método será executado por 5 segundos
                // Antes de iniciar a MainActivity
                Intent i = new Intent(TelaCerregamentoActivity.this, MainActivity.class);
                startActivity(i);
                // Fecha a activity atual
                finish();
            }
        }, TEMPO_SPLASH);

    }


}
