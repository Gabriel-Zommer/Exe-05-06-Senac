/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itemvenda;

/**
 *
 * @author Zommer
 */
class Salgadinho extends ItemVenda {
    private String tipo;
    private String massa;
    private String recheio;

    public Salgadinho(double preco, String dataValidade, double peso, String tipo, String massa, String recheio) {
        super(preco, dataValidade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMassa() {
        return massa;
    }

    public String getRecheio() {
        return recheio;
    }
}
