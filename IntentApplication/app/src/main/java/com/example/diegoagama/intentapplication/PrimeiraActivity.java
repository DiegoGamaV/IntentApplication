package com.example.diegoagama.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrimeiraActivity extends AppCompatActivity {

    private EditText editaTexto; //Criado um atributo EditText
    private Button botao = (Button) findViewById(R.id.botao); //Criado um atributo Botão;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        editaTexto = (EditText) findViewById(R.id.texto); //Primeira Questão - Vinculado o atributo EditText com o id do componente
        Log.i("PrimeiraActivity", editaTexto.toString()); //Primeira Questão - Enviado o texto do componente ao logcat
        Toast mensagem = Toast.makeText(PrimeiraActivity.this, editaTexto.toString(), Toast.LENGTH_LONG); //Segunda Questão - Enviado o texto ao componente Toast
        mensagem.show();//Segunda Questão - Exibida a mensagem
        botao.setOnClickListener(new View.OnClickListener(){ //Terceira Questão - Posto o botão a esperar
            public void onClick(View v) { //Terceira Questão - Criado o método onClick
                Intent intent1 = new Intent(PrimeiraActivity.this, SegundaActivity.class); //Instanciado o intent para ir para a próxima tela
                String chave = "chave";
                intent1.putExtra(chave, editaTexto.toString()); //Quarta Questão - Mensagem do EditText posta no objeto Intent, pelo putExtra
                startActivity(intent1); //Intent em ação para passar de tela
            }
        });
    }
}


