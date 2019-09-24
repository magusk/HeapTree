package com.heap.tree;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Heap / Priority Queue
        FilaBanco fila = new FilaBanco();
        fila.addPessoa("Joe", 20);
        fila.addPessoa("Mike", 16);
        fila.addPessoa("Bob", 64);
        fila.addPessoa("Dick", 50);

        for (Pessoa pessoa: fila.heapSort()) {
            System.out.println(pessoa.toString());
        }

        while (fila.getSize() > 0) {
            Pessoa p = fila.peek();
            System.out.println(p.getNome() + " está sendo atendido.");
            fila.remove();
        }
    }
}
