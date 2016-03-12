/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import com.dmodena.helper.Helper;
import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class Venda {
    private int codigo;
    private String data;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    
    public Venda(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }    
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    
    public double calcularVenda() {
        double valor = 0.0;
        
        for(Produto produto : produtos) {
            valor += produto.getPreco();
        }
        
        return Helper.arredondar(valor, 2);
    }
    
    @Override
    public String toString() {
        return codigo + " " + data + " " + cliente.getNome() + " " + produtos.size() + " itens R$" + calcularVenda();
    }
}
