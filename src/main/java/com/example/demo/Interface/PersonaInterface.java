package com.example.demo.Interface;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Persona;

public interface PersonaInterface {
   public List<Persona>listar();
   public Optional<Persona>listarID(int id);
   public int save(Persona p);
   public void delete(int id);
}
