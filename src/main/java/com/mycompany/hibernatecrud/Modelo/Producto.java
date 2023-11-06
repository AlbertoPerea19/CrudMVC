package com.mycompany.hibernatecrud.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String nombre;
   private int precio;
   private int codigo;
   
   public Producto() {
   }


   public Producto(int id, String nombre, int precio, int codigo) {
      this.id = id;
      this.nombre = nombre;
      this.precio = precio;
      this.codigo = codigo;
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
   public int getPrecio() {
      return precio;
   }
   public void setPrecio(int precio) {
      this.precio = precio;
   }
   public int getCodigo() {
      return codigo;
   }
   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   
}
