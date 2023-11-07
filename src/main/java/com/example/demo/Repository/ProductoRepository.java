package com.example.demo.Repository;

import com.example.demo.Model.Producto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto,Integer>{
   
}
