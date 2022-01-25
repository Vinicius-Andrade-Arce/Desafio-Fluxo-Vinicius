package com.desafio.vinicius.DataBase;

import com.desafio.vinicius.Entidade.Sensivel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorySensivel extends JpaRepository<Sensivel, Long>{
    
}
