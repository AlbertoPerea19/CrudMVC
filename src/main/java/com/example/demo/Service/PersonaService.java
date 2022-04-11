package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Interface.PersonaInterface;
import com.example.demo.Model.Persona;
import com.example.demo.Repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements PersonaInterface {
   
   @Autowired
   private PersonaRepository dato;

   @Override
   public List<Persona> listar() {
      return (List<Persona>) dato.findAll();
   }

   @Override
   public Optional<Persona> listarID(int id) {
      return dato.findById(id);
   }

   @Override
   public int save(Persona p) {
      int respuesta=0;
      Persona persona=dato.save(p);
      if(!persona.equals(null)){
         respuesta=1;
      }
      return respuesta;
   }

   @Override
   public void delete(int id) {
      dato.deleteById(id);
   }


}
