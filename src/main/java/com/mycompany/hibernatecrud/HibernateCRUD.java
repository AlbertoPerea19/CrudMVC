/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernatecrud;

import com.mycompany.hibernatecrud.Controlador.ControladorProducto;
import com.mycompany.hibernatecrud.Modelo.ConsultasProducto;
import com.mycompany.hibernatecrud.Vista.VProducto;

/**
 *
 * @author betoh
 */
public class HibernateCRUD {

    public static void main(String[] args) {
        VProducto vista = new VProducto();
        ConsultasProducto consultas = new ConsultasProducto();
        ControladorProducto controlador = new ControladorProducto(vista, consultas);

        controlador.iniciar(); // Inicializa la vista

        vista.setVisible(true); // Muestra la vista
    }
}
