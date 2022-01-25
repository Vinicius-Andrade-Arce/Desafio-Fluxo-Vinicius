package com.desafio.vinicius.Entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Rapido {

    @Id
    private Long id;
    @Lob
    private String ultimasConsutas;
    @Lob
    private String movimentacao;
    @Lob
    private String dadosCompras;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUltimasConsutas() {
        return ultimasConsutas;
    }
    public void setUltimasConsutas(String ultimasConsutas) {
        this.ultimasConsutas = ultimasConsutas;
    }
    public String getMovimentacao() {
        return movimentacao;
    }
    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }
    public String getDadosCompras() {
        return dadosCompras;
    }
    public void setDadosCompras(String dadosCompras) {
        this.dadosCompras = dadosCompras;
    }    
    
    
}
