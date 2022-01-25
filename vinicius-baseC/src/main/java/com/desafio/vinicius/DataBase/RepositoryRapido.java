package com.desafio.vinicius.DataBase;

import com.desafio.vinicius.Entidade.Rapido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRapido extends JpaRepository<Rapido, Long>{
    
}
