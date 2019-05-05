package com.example.lojapetshop;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastrar extends AppCompatActivity {

    EditText txtCadNome;
    EditText txtCadEmail;
    EditText txtCadCpf;
    EditText txtCadEndereco;
    EditText txtCadTelefone;
    Button btnCadUsuario;
    Button btnCadVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrar);

        txtCadNome = (EditText) findViewById(R.id.txtCadNome);
        txtCadEmail = (EditText) findViewById(R.id.txtCadEmail);
        txtCadCpf = (EditText) findViewById(R.id.txtCadCpf);
        txtCadEndereco = (EditText) findViewById(R.id.txtCadTelefone);
        txtCadTelefone = (EditText) findViewById(R.id.txtCadTelefone);
        btnCadUsuario = (Button) findViewById(R.id.btnCadUsuario);
        btnCadVoltar = (Button) findViewById(R.id.btnCadVoltar);


        btnCadUsuario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Cliente cliente = new Cliente();
                //Verifica Campos ao Cadastrar
                if(txtCadNome == null){
                    txtCadNome.setText("Campo Obrigatório");
                }
                if(txtCadEmail == null){
                    txtCadNome.setText("Campo Obrigatório");
                }
                if(txtCadCpf == null){
                    txtCadNome.setText("Campo Obrigatório");
                }
                if(txtCadEndereco == null){
                    txtCadNome.setText("Campo Obrigatório");
                }
                if(txtCadTelefone == null){
                    txtCadNome.setText("Campo Obrigatório");
                }

                //Seta os valores no objeto

                if(txtCadNome != null){
                   cliente.setNome(txtCadNome.getText().toString());
                }
                if(txtCadEmail != null){
                    cliente.setEmail(txtCadEmail.getText().toString());
                }
                if(txtCadCpf != null){
                    cliente.setCpf(txtCadCpf.getText().toString());
                }
                if(txtCadEndereco != null){
                    cliente.setEndereco(txtCadEndereco.getText().toString());
                }
                if(txtCadTelefone != null){
                    cliente.setTelefone(txtCadTelefone.getText().toString());
                }

            }
        });


        btnCadVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaCadastrar.this,TelaLogin.class);
                startActivity(i);
            }
        });

    }
}
