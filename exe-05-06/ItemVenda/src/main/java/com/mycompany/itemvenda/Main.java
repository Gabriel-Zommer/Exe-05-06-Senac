/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itemvenda;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando algumas pizzas para o cardápio
        Pizza pizza1 = new Pizza(30.0, "2023-05-31", 500, "Calabresa", true, "Tomate");
        Pizza pizza2 = new Pizza(35.0, "2023-05-31", 550, "Mussarela", false, "Tomate");
        Pizza pizza3 = new Pizza(40.0, "2023-05-31", 600, "Portuguesa", true, "Tomate");

        // Adicionando as pizzas ao cardápio
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarPizza(pizza1);
        cardapio.adicionarPizza(pizza2);
        cardapio.adicionarPizza(pizza3);

        // Criando um pedido
        Pedido pedido = new Pedido("João");

        // Adicionando itens ao pedido
        pedido.adicionarItem(pizza1);
        pedido.adicionarItem(new Lanche(20.0, "2023-05-31", 300, "Integral", "Frango", "Maionese"));
        pedido.adicionarItem(new Salgadinho(5.0, "2023-05-31", 50, "Assado", "Massa Folhada", "Queijo"));

        // Definindo a taxa de serviço
        pedido.setTaxaServico(5.0);

        // Exibindo a nota fiscal
        pedido.exibirNotaFiscal();

        // Simulando o valor recebido pelo vendedor
        System.out.print("Valor recebido em dinheiro: ");
        double valorRecebido = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(valorRecebido);

        // Calculando e exibindo o troco
        double valorTotal = pedido.calcularValorTotal();
        double troco = vendedor.calcularTroco(valorTotal);
        System.out.println("Troco: R$" + troco);

        scanner.close();
    }
}
