/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contato;

import java.util.ArrayList;

/**
 *
 * @author Zommer
 */
class Pessoa {
    private String nome;
    private ArrayList<Contato> contatos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato[] getContatos() {
        return contatos.toArray(new Contato[contatos.size()]);
    }

    public Contato[] getContatos(String tipo) {
        ArrayList<Contato> contatosDoTipo = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getTipo().equals(tipo)) {
                contatosDoTipo.add(contato);
            }
        }
        return contatosDoTipo.toArray(new Contato[contatosDoTipo.size()]);
    }

    public boolean possuiEmail() {
        for (Contato contato : contatos) {
            if (contato.getTipo().equals("email")) {
                return true;
            }
        }
        return false;
    }

    public boolean possuiTelefone() {
        for (Contato contato : contatos) {
            if (contato.getTipo().equals("telefone")) {
                return true;
            }
        }
        return false;
    }

    public void exibirContatos() {
        System.out.println("Nome: " + nome);
        System.out.println("Contatos:");

        for (Contato contato : contatos) {
            System.out.println("Tipo: " + contato.getTipo() + ", Valor: " + contato.getValor());
        }
    }
}
