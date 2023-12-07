
package br.edu.univille.microservprofessor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.univille.microservprofessor.entity.Dados;


@RestController
@RequestMapping("/api/v1/dados")
public class DadosAPIController {
    @GetMapping
    public ResponseEntity<List<Dados>> listaDados(){
        var listaDados = new ArrayList<Dados>();

        return new ResponseEntity<List<Dados>>(listaDados,HttpStatus.OK);
        
    }
    
}
