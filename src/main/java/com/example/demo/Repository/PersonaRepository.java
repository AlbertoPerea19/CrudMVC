package com.example.demo.Repository;

import com.example.demo.Model.Persona;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Integer>{
   
}
