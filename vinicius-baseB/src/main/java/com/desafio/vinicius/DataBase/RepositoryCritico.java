package com.desafio.vinicius.DataBase;

import com.desafio.vinicius.Entidade.Critico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCritico extends JpaRepository<Critico, Long>{
    
}
