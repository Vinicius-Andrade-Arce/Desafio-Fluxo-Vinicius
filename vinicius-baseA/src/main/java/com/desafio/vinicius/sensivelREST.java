package com.desafio.vinicius;

import java.util.List;

import com.desafio.vinicius.DataBase.RepositorySensivel;
import com.desafio.vinicius.Entidade.Sensivel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basea")
public class sensivelREST {
    @Autowired
    private RepositorySensivel repositorioSensivel;

    @GetMapping
    public List<Sensivel>listar(){
        return repositorioSensivel.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Sensivel basea){
        repositorioSensivel.save(basea);
    }

    @PutMapping
    public void alterar(@RequestBody Sensivel basea){
        if(basea.getId()>0)
            repositorioSensivel.save(basea);

    } 

    @DeleteMapping
    public void excluir(@RequestBody Sensivel basea){
        repositorioSensivel.delete(basea);
    }
}
