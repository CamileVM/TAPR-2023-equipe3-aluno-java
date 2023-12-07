package br.edu.univille.microservprofessor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.microservprofessor.entity.Disciplina;

@Repository
public interface DisciplinaRepository
    extends CrudRepository<Disciplina,String>{

}