package com.primeiroprojeto.estagio;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfiguracoesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnVoltarMain;
    private Button btnHistorico;
    private TextView txtPoliticadePrivacidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        btnVoltarMain = (Button) findViewById(R.id.btnVoltarMain);
        btnHistorico = (Button) findViewById(R.id.btnHistorico);
        txtPoliticadePrivacidade = (TextView) findViewById(R.id.txtPoliticadePrivacidade);

        btnVoltarMain.setOnClickListener(this);
        btnHistorico.setOnClickListener(this);
        txtPoliticadePrivacidade.setOnClickListener(this);

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


            case R.id.txtPoliticadePrivacidade:
                it = new Intent(this, PoliticasDePrivacidadeActivity.class);
                startActivity(it);
                break;

        }
    }

    }
