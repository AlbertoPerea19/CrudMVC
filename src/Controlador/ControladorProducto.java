package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.VProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorProducto implements ActionListener {
    private Producto producto;
    private VProducto vista;
    private ConsultasProducto consultas;

    public ControladorProducto(Producto producto, VProducto vista, ConsultasProducto consultas) {
        this.producto = producto;
        this.vista = vista;
        this.consultas = consultas;
        this.vista.btn_agregar.addActionListener(this);
        this.vista.btn_modificar.addActionListener(this);
        this.vista.btn_eliminar.addActionListener(this);
        this.vista.btn_buscar.addActionListener(this);
        this.vista.btn_limpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_agregar) {
            agregarProducto();
        } else if (e.getSource() == vista.btn_modificar) {
            modificarProducto();
        } else if (e.getSource() == vista.btn_eliminar) {
            eliminarProducto();
        } else if (e.getSource() == vista.btn_buscar) {
            buscarProducto();
        } else if (e.getSource() == vista.btn_limpiar) {
            limpiarCampos();
        }
    }

    private void agregarProducto() {
        llenarProductoDesdeVista();
        if (consultas.registrar(producto)) {
            JOptionPane.showMessageDialog(null, "Producto agregado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar");
            limpiarCampos();
        }
    }

    private void modificarProducto() {
        llenarProductoDesdeVista();
        if (consultas.modificar(producto)) {
            JOptionPane.showMessageDialog(null, "Producto modificado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar");
            limpiarCampos();
        }
    }

    private void eliminarProducto() {
        producto.setId(Integer.parseInt(vista.txt_id.getText()));
        if (consultas.eliminar(producto)) {
            JOptionPane.showMessageDialog(null, "Producto eliminado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
            limpiarCampos();
        }
    }

    private void buscarProducto() {
        producto.setId(Integer.parseInt(vista.txt_id.getText()));
        if (consultas.buscar(producto)) {
            llenarVistaDesdeProducto();
        } else {
            JOptionPane.showMessageDialog(null, "Error al buscar");
            limpiarCampos();
        }
    }

    private void llenarProductoDesdeVista() {
        producto.setCodigo(vista.txt_codigo.getText());
        producto.setNombre(vista.txt_nombre.getText());
        producto.setPrecio(Integer.parseInt(vista.txt_precio.getText()));
    }

    private void llenarVistaDesdeProducto() {
        vista.txt_id.setText(String.valueOf(producto.getId()));
        vista.txt_codigo.setText(producto.getCodigo());
        vista.txt_nombre.setText(producto.getNombre());
        vista.txt_precio.setText(String.valueOf(producto.getPrecio()));
    }

    private void limpiarCampos() {
        vista.txt_codigo.setText("");
        vista.txt_id.setText("");
        vista.txt_nombre.setText("");
        vista.txt_precio.setText("");
    }
}
