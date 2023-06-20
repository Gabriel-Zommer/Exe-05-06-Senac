/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itemvenda;

/**
 *
 * @author Zommer
 */
class Vendedor {
    private double valorRecebido;

    public Vendedor(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double calcularTroco(double valorTotal) {
        return valorRecebido - valorTotal;
    }
}
