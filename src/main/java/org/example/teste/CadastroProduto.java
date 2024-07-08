package org.example.teste;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.model.Produto;

import java.math.BigDecimal;

public class CadastroProduto {


    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
        EntityManager manager = factory.createEntityManager();

        Produto produto =  new Produto();
        produto.setNome("Tablet");
        produto.setDescricao("Tablet Samsung");
        produto.setPrecoAtual(new BigDecimal(2000) );

        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();


        manager.close();
        factory.close();
    }
}
