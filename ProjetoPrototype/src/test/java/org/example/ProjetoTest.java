package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Projeto projeto = new Projeto("001", "Projeto A", "Gerente A", new Orcamento(10000.0, "Desenvolvimento"));
        Projeto projetoClone = projeto.clone();
        projetoClone.setCodigo("002");
        projetoClone.setNome("Projeto A Clonado");
        projetoClone.setOrcamento(new Orcamento(20000.0, "Desenvolvimento Clonado"));

        assertEquals("Projeto{codigo='001', nome='Projeto A', gerente='Gerente A', orcamento=Orcamento{valorMaximo=10000.0, centroDeCusto='Desenvolvimento'}}", projeto.toString());
        assertEquals("Projeto{codigo='002', nome='Projeto A Clonado', gerente='Gerente A', orcamento=Orcamento{valorMaximo=20000.0, centroDeCusto='Desenvolvimento Clonado'}}", projetoClone.toString());

    }

}