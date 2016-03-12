/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author dmodena
 */
public class Aluno {
    private String nome;
    private int idade;
    private char sexo;
    
    public Aluno() {
        nome = "";
        idade = 0;
        sexo = 'I';
    }
    
    public Aluno(String nome) {
        this.nome = nome;
        idade = 0;
        sexo = 'I';
    }
    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Aluno(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return (nome + " - " + sexo + " - " + idade + " anos");
    }
}
