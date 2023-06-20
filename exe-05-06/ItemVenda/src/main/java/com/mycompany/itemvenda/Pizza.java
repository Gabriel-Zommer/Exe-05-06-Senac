/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itemvenda;

/**
 *
 * @author Zommer
 */
class Pizza extends ItemVenda {
    private String recheio;
    private boolean bordaRecheada;
    private String molho;

    public Pizza(double preco, String dataValidade, double peso, String recheio, boolean bordaRecheada, String molho) {
        super(preco, dataValidade, peso);
        this.recheio = recheio;
        this.bordaRecheada = bordaRecheada;
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public boolean hasBordaRecheada() {
        return bordaRecheada;
    }

    public String getMolho() {
        return molho;
    }
}