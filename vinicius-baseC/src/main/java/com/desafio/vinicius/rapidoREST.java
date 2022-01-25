package com.desafio.vinicius;

import java.util.List;

import com.desafio.vinicius.DataBase.RepositoryRapido;
import com.desafio.vinicius.Entidade.Rapido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basec")
public class rapidoREST {
    @Autowired
    private RepositoryRapido repositorioCritico;

    @GetMapping
    public List<Rapido>listar(){
        return repositorioCritico.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Rapido basec){
        repositorioCritico.save(basec);
    }

    @PutMapping
    public void alterar(@RequestBody Rapido basec){
        if(basec.getId()>0)
            repositorioCritico.save(basec);

    } 

    @DeleteMapping
    public void excluir(@RequestBody Rapido basec){
        repositorioCritico.delete(basec);
    }
}
