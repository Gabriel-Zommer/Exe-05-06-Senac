/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itemvenda;

/**
 *
 * @author Zommer
 */
class Lanche extends ItemVenda {
    private String tipoPao;
    private String recheio;
    private String molho;

    public Lanche(double preco, String dataValidade, double peso, String tipoPao, String recheio, String molho) {
        super(preco, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molho = molho;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public String getRecheio() {
        return recheio;
    }

    public String getMolho() {
        return molho;
    }
}
