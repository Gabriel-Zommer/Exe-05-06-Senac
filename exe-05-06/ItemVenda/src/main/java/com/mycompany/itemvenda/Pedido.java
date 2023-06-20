/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itemvenda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zommer
 */
class Pedido {
    private String nomeCliente;
    private List<ItemVenda> itens;
    private double taxaServico;

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>();
        this.taxaServico = 0.0;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (ItemVenda item : itens) {
            valorTotal += item.getPreco();
        }
        valorTotal += taxaServico;
        return valorTotal;
    }

    public void exibirNotaFiscal() {
        System.out.println("========== Nota Fiscal ==========");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Itens:");
        for (ItemVenda item : itens) {
            System.out.println("- " + item.getClass().getSimpleName() + ": R$" + item.getPreco());
        }
        System.out.println("Taxa de Serviço: R$" + taxaServico);
        System.out.println("Total: R$" + calcularValorTotal());
        System.out.println("=================================");
    }
}
