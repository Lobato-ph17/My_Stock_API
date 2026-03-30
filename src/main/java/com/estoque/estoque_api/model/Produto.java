package com.estoque.estoque_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")

public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String nome;

        @Column(nullable = false)
        private int quantidade;

        @Column(nullable = false)
        private double preco;

        public Produto() {
    
        }

        public Produto(String nome, int quantidade, double preco) {
            this.nome= nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }

        public String getNome() {
         return nome;
        }

        public void setNome(String novoNome){
            this.nome = novoNome;
        }


        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int novaQuantidade){
            this.quantidade = novaQuantidade;
        }


        public double getPreco() {
            return preco;
        }

        public void setPreco(double novoPreco){
            this.preco = novoPreco;
        }

       public Long getId(){
        return id;
       }
}
   



    
