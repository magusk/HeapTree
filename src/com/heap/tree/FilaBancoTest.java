package com.heap.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilaBancoTest {

    FilaBanco fila = null;

    @Before
    public void init() {
        fila = new FilaBanco();
    }

    @Test
    public void mustBeOrdered() {
        //Arrange
        Pessoa grandma = new Pessoa("Grandma", 65);
        Pessoa grandpa = new Pessoa("Grandpa", 70);
        Pessoa keith = new Pessoa("Keith", 25);

        //Act
        fila.addPessoa(grandma);
        fila.addPessoa(grandpa);
        fila.addPessoa(keith);

        //Assert
        assertSame(grandpa, fila.peek());
        fila.remove();
        assertSame(grandma, fila.peek());
        fila.remove();
        assertSame(keith, fila.peek());
        fila.remove();
        assertNull(fila.peek());
    }

    @Test
    public void mustReorderWhenPriorityChange() {
        //Arrange
        Pessoa grandma = new Pessoa("Grandma", 65);
        Pessoa grandpa = new Pessoa("Grandpa", 70);
        Pessoa keith = new Pessoa("Keith", 25);
        fila.addPessoa(grandma);
        fila.addPessoa(grandpa);
        fila.addPessoa(keith);

        //Act
        grandma.setIdade(77);

        //Assert
        assertSame(grandma, fila.peek());
    }

    @Test
    public void peekMustReturnFirstElement() {
        //Arrange
        Pessoa node = new Pessoa("Node", 10);

        //Act
        fila.addPessoa(node);

        //Assert
        assertSame(node, fila.peek());
    }


    @Test
    public void mustBeInitializedEmpty() {
        //Assert
        assertNull(fila.peek());
    }
}