/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.itemvenda;

/**
 *
 * @author Zommer
 */
class ItemVenda {
    private double preco;
    private String dataValidade;
    private double peso;

    public ItemVenda(double preco, String dataValidade, double peso) {
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public double getPeso() {
        return peso;
    }
}
