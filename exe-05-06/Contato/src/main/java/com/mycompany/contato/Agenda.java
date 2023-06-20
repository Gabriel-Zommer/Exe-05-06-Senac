/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contato;

/**
 *
 * @author Zommer
 */
public class Agenda {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");

        pessoa.adicionarContato(new Contato("telefone", "(99) 9999-9999"));
        pessoa.adicionarContato(new Contato("telefone", "(88) 8888-8888"));
        pessoa.adicionarContato(new Contato("email", "joao@example.com"));

        Contato[] todosContatos = pessoa.getContatos();
        System.out.println("Todos os contatos:");
        for (Contato contato : todosContatos) {
            System.out.println("Tipo: " + contato.getTipo() + ", Valor: " + contato.getValor());
        }

        Contato[] contatosTelefone = pessoa.getContatos("telefone");
        System.out.println("\nContatos de telefone:");
        for (Contato contato : contatosTelefone) {
            System.out.println("Tipo: " + contato.getTipo() + ", Valor: " + contato.getValor());
        }

        boolean possuiEmail = pessoa.possuiEmail();
        System.out.println("\nPossui email? " + possuiEmail);

        boolean possuiTelefone = pessoa.possuiTelefone();
        System.out.println("Possui telefone? " + possuiTelefone);

        pessoa.exibirContatos();
    }
}
