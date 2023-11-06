package com.mycompany.hibernatecrud.Controlador;

import com.mycompany.hibernatecrud.Modelo.ConsultasProducto;
import com.mycompany.hibernatecrud.Modelo.Producto;
import com.mycompany.hibernatecrud.Vista.VProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorProducto {
    private final VProducto vista;
    private final ConsultasProducto consultas;

    public ControladorProducto(VProducto vista, ConsultasProducto consultas) {
        this.vista = vista;
        this.consultas = consultas;
        
        // Agregar ActionListener a los botones
        this.vista.btn_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProducto();
            }
        });
        
        this.vista.btn_modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarProducto();
            }
        });
        
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarProducto();
            }
        });
        
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });
        
        this.vista.btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    public void agregarProducto() {
        String nombre = vista.txt_nombre.getText();
        int precio = Integer.parseInt(vista.txt_precio.getText());
        int codigo = Integer.parseInt(vista.txt_codigo.getText());

        Producto producto = new Producto(0, nombre, precio, codigo);
        
        if (consultas.registrar(producto)) {
            JOptionPane.showMessageDialog(null, "Producto registrado exitosamente");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el producto");
        }
    }
    
    public void modificarProducto() {
        int id = Integer.parseInt(vista.txt_id.getText());
        String nombre = vista.txt_nombre.getText();
        int precio = Integer.parseInt(vista.txt_precio.getText());
        int codigo = Integer.parseInt(vista.txt_codigo.getText());

        Producto producto = new Producto(id, nombre, precio, codigo);
        
        if (consultas.modificar(producto)) {
            JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto");
        }
    }
    
    public void eliminarProducto() {
        int id = Integer.parseInt(vista.txt_id.getText());
        
        Producto producto = consultas.buscar(id);
        
        if (producto != null) {
            if (consultas.eliminar(producto)) {
                JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto con ID " + id);
        }
    }
    
    public void buscarProducto() {
        int id = Integer.parseInt(vista.txt_id.getText());
        
        Producto producto = consultas.buscar(id);
        
        if (producto != null) {
            vista.txt_nombre.setText(producto.getNombre());
            vista.txt_precio.setText(String.valueOf(producto.getPrecio()));
            vista.txt_codigo.setText(String.valueOf(producto.getCodigo()));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto con ID " + id);
            limpiarCampos();
        }
    }
    
    public void limpiarCampos() {
        vista.txt_id.setText("");
        vista.txt_nombre.setText("");
        vista.txt_precio.setText("");
        vista.txt_codigo.setText("");
    }
    
    public void iniciar() {
        vista.setTitle("Gestión de Productos");
        vista.setLocationRelativeTo(null);
    }
}
