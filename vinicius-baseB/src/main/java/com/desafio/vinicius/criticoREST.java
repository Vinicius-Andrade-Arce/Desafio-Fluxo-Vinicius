package com.desafio.vinicius;

import java.util.List;

import com.desafio.vinicius.DataBase.RepositoryCritico;
import com.desafio.vinicius.Entidade.Critico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseb")
public class criticoREST {
    @Autowired
    private RepositoryCritico repositorioCritico;

    @GetMapping
    public List<Critico>listar(){
        return repositorioCritico.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Critico baseb){
        repositorioCritico.save(baseb);
    }

    @PutMapping
    public void alterar(@RequestBody Critico baseb){
        if(baseb.getId()>0)
            repositorioCritico.save(baseb);

    } 

    @DeleteMapping
    public void excluir(@RequestBody Critico baseb){
        repositorioCritico.delete(baseb);
    }
}
