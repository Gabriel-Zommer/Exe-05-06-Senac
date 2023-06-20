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
class Cardapio {
    private List<Pizza> pizzas;

    public Cardapio() {
        pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
