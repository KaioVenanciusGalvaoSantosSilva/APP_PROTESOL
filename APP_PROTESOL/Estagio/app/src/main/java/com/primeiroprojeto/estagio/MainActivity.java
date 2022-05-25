package com.primeiroprojeto.estagio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnHistorico;
    private Button btnConfiguracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHistorico = (Button) findViewById(R.id.btnHistorico);
        btnConfiguracoes = (Button) findViewById(R.id.btnConfiguracoes);


        btnHistorico.setOnClickListener(this);
        btnConfiguracoes.setOnClickListener(this);


    }
       @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnHistorico:
                Intent it = new Intent(this, HistoricoActivity.class);
                startActivity(it);
                break;

            case R.id.btnConfiguracoes:
                 it = new Intent(this, ConfiguracoesActivity.class);
                startActivity(it);
                break;



        }
    }

}