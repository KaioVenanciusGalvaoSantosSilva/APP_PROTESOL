package com.primeiroprojeto.estagio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoricoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnVoltarMain;
    private Button btnConfiguracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        btnVoltarMain = (Button) findViewById(R.id.btnVoltarMain);
        btnConfiguracoes = (Button) findViewById(R.id.btnConfiguracoes);

        btnVoltarMain.setOnClickListener(this);
        btnConfiguracoes.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnVoltarMain:
                Intent it = new Intent(this, MainActivity.class);
                startActivity(it);
                break;

            case R.id.btnConfiguracoes:
                it = new Intent(this, ConfiguracoesActivity.class);
                startActivity(it);
                break;

        }
    }
}