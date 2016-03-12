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
public class Senha {
    private String nomeA;
    private String nomeB;
    private String nomeC;
    private final String senha;
    
    public Senha(String nomeA, String nomeB, String nomeC) {
        this.nomeA = nomeA;
        this.nomeB = nomeB;
        this.nomeC = nomeC;
        this.senha = gerarSenha();
    }

    public String getNomeA() {
        return nomeA;
    }

    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public String getNomeB() {
        return nomeB;
    }

    public void setNomeB(String nomeB) {
        this.nomeB = nomeB;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }
    
    public String getSenha() {
        return senha;
    }
    
    private String gerarSenha() {
        String senhaGerada = "";
        
        if(!(nomeA.isEmpty() || nomeB.isEmpty() || nomeC.isEmpty())) {
            senhaGerada += nomeA.charAt(0);
            senhaGerada += nomeA.charAt(nomeA.length() - 1);
            senhaGerada += primeiraMetade(nomeB);
            senhaGerada += imparesMaiusculos(nomeC);
        }
        
        return senhaGerada;
    }
    
    private String primeiraMetade(String palavra) {
        String primeiraMetade;
        
        if(palavra.length() % 2 == 0) {
            primeiraMetade = palavra.substring(0, (palavra.length() / 2));
        }
        else {
            primeiraMetade = palavra.substring(0, ((palavra.length() + 1) / 2));
        }
        
        return primeiraMetade;
    }
    
    private String imparesMaiusculos(String palavra) {
        String imparesMaiusculos = "";
        
        for(int i = 0; i < palavra.length(); i++) {
            if(i % 2 == 0) {
                imparesMaiusculos += palavra.charAt(i);
            }
        }
        
        imparesMaiusculos = imparesMaiusculos.toUpperCase();
        
        return imparesMaiusculos;
    }
}
