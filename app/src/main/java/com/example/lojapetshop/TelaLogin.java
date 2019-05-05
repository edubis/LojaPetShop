package com.example.lojapetshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaLogin extends AppCompatActivity {

    Button btnCadastrar;
    Button btnLogar;
    EditText txtUsuario;
    EditText txtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnLogar = (Button) findViewById(R.id.btnLogar);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = txtUsuario.getText().toString();
                String senha = txtSenha.getText().toString();

            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaLogin.this, TelaCadastrar.class);
                startActivity(i);
            }
        });


    }



}
