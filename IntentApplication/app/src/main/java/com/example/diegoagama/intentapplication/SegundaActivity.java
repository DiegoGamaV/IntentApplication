package com.example.diegoagama.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent2 = getIntent(); //Quarta Questão - Inicializado obejto intent com as informações do Intent anterior
        Bundle bundle2 = intent2.getExtras(); //Quarta Questão - Recebendo todas as informações passadas pelo Bundle
        String chave = "chave";
        TextView textView = (TextView) findViewById(R.id.textView); //Quarta Questão - Associando o objeto TextView com o componente pelo id
        textView.setText(bundle2.getString(chave)); //Mostrando a mensagem específica no componente
    }
}
