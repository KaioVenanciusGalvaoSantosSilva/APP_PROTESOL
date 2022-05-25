package com.primeiroprojeto.estagio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PoliticasDePrivacidadeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnVoltarMain;
    private Button btnHistorico;
    private Button btnConfiguracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicasdeprivacidade);

        btnVoltarMain = (Button) findViewById(R.id.btnVoltarMain);
        btnHistorico = (Button) findViewById(R.id.btnHistorico);
        btnConfiguracoes = (Button) findViewById(R.id.btnConfiguracoes);


        btnVoltarMain.setOnClickListener(this);
        btnHistorico.setOnClickListener(this);
        btnConfiguracoes.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnVoltarMain:
                Intent it = new Intent(this, MainActivity.class);
                startActivity(it);
                break;

            case R.id.btnHistorico:
                it = new Intent(this, HistoricoActivity.class);
                startActivity(it);
                break;

            case R.id.btnConfiguracoes:
                it = new Intent(this, ConfiguracoesActivity.class);
                startActivity(it);
                break;




        }
    }
}