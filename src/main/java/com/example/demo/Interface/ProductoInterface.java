package com.example.demo.Interface;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Producto;

public interface ProductoInterface {
   public List<Producto>listar();
   public Optional<Producto>listarID(int id);
   public int save(Producto p);
   public void delete(int id);
}
