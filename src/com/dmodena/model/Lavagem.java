/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import com.dmodena.helper.Helper;

/**
 *
 * @author dmodena
 */
public class Lavagem {
    private String cliente;
    private int tipoServico;
    private boolean aplicarCera;
    private double lavagemSimples;
    private double lavagemCompleta;
    private double cera;
    private double total;
    
    public Lavagem() {
        cliente = "";
        tipoServico = 1;
        aplicarCera = false;
        lavagemSimples = 36d;
        lavagemCompleta = 60d;
        cera = 200d;
        total = calcularTotal();
    }
    
    public Lavagem(String cliente, int tipoServico, boolean aplicarCera) {
        this();
        this.cliente = cliente;
        this.tipoServico = tipoServico;
        this.aplicarCera = aplicarCera;
        total = calcularTotal();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(int tipoServico) {
        this.tipoServico = tipoServico;
    }

    public boolean isAplicarCera() {
        return aplicarCera;
    }

    public void setAplicarCera(boolean aplicarCera) {
        this.aplicarCera = aplicarCera;
    }

    public double getLavagemSimples() {
        return lavagemSimples;
    }

    public void setLavagemSimples(double lavagemSimples) {
        this.lavagemSimples = lavagemSimples;
    }

    public double getLavagemCompleta() {
        return lavagemCompleta;
    }

    public void setLavagemCompleta(double lavagemCompleta) {
        this.lavagemCompleta = lavagemCompleta;
    }

    public double getCera() {
        return cera;
    }

    public void setCera(double cera) {
        this.cera = cera;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double calcularTotal() {
        double total = 0d;
        
        if(aplicarCera) {
            total += cera;
        }
        
        if(tipoServico == 1) {
            total += lavagemSimples;
        }
        else if(tipoServico == 2) {
            total += lavagemCompleta;
        }
        
        return Helper.arredondar(total, 2);
    }
    
    @Override
    public String toString() {
        String lavagem = "", cera;
        
        if(tipoServico == 1) {
            lavagem = "simples";
        }
        else if(tipoServico == 2) {
            lavagem = "completa";
        }
        
        if(aplicarCera) {
            cera = "sim";
        }
        else {
            cera = "não";
        }
        
        return (cliente + " - l. " + lavagem + " - cera: " + cera + " - Total R$" + total);
    }
}
