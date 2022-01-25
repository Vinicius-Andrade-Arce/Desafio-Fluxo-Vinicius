package com.desafio.vinicius.Entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;



@Entity
public class Sensivel {

    @Id
    private Long id;
    @Lob
    private String nome;
    @Lob
    private String endereco;
    private String dividas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDividas() {
        return dividas;
    }

    public void setDividas(String dividas) {
        this.dividas = dividas;
    }
           
    
    
}
