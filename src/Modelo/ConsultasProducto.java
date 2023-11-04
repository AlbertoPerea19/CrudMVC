package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasProducto {
    private Conexion conexion;

    public ConsultasProducto() {
        conexion = new Conexion();
    }
    
    public boolean registrar(Producto producto) {
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement("INSERT INTO producto (codigo, nombre, precio) VALUES (?, ?, ?)")) {
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean modificar(Producto producto) {
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement("UPDATE producto SET codigo=?, nombre=?, precio=? WHERE id=?")) {
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean eliminar(Producto producto) {
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement("DELETE FROM producto WHERE id=?")) {
            ps.setInt(1, producto.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean buscar(Producto producto) {
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE id=?")) {
            ps.setInt(1, producto.getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    producto.setId(rs.getInt("id"));
                    producto.setCodigo(rs.getString("codigo"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setPrecio(rs.getInt("precio"));
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
