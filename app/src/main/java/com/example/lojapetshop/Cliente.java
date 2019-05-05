package com.example.lojapetshop;

public class Cliente {

    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String cpf;


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Construtor
    public Cliente() {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}
