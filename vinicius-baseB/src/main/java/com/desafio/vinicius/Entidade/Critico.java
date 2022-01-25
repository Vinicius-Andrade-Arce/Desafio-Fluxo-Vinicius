package com.desafio.vinicius.Entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;



@Entity
public class Critico {

    @Id
    private Long id;
    private String idade;
    @Lob
    private String listaBens;
    @Lob
    private String endereco;
    @Lob
    private String fonteRenda;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getListaBens() {
        return listaBens;
    }
    public void setListaBens(String listaBens) {
        this.listaBens = listaBens;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getFonteRenda() {
        return fonteRenda;
    }
    public void setFonteRenda(String fonteRenda) {
        this.fonteRenda = fonteRenda;
    }

    
    
}
