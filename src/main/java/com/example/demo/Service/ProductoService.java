package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Interface.ProductoInterface;
import com.example.demo.Model.Producto;
import com.example.demo.Repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements ProductoInterface {
   
   @Autowired
   private ProductoRepository dato;

   @Override
   public List<Producto> listar() {
      return (List<Producto>) dato.findAll();
   }

   @Override
   public Optional<Producto> listarID(int id) {
      return dato.findById(id);
   }

   @Override
   public int save(Producto p) {
      int respuesta=0;
      Producto producto=dato.save(p);
      if(!producto.equals(null)){
         respuesta=1;
      }
      return respuesta;
   }

   @Override
   public void delete(int id) {
      dato.deleteById(id);
   }


}
