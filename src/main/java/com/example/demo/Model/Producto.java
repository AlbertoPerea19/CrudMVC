package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String nombre;
   private int codigo;
   private int precio;
   

   public Producto() {
   }
   public Producto(int id, String nombre, int codigo, int precio) {
      this.id = id;
      this.nombre = nombre;
      this.codigo = codigo;
      this.precio = precio;
   }
   

   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public int getCodigo() {
      return codigo;
   }
   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }
   public int getPrecio() {
      return precio;
   }
   public void setPrecio(int precio) {
      this.precio = precio;
   }

   
}
