package com.mycompany.hibernatecrud.Modelo;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mycompany.hibernatecrud.config.HibernateUtil;

public class ConsultasProducto {
    public boolean registrar(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.persist(producto);
            tx.commit();
            return true;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean modificar(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
    
        try {
            tx = session.beginTransaction();
            session.merge(producto);  // Use merge for updating
            tx.commit();
            return true;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean eliminar(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
    
        try {
            tx = session.beginTransaction();
            session.remove(producto);
            tx.commit();
            return true;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public Producto buscar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
    
        try {
            Producto producto = session.get(Producto.class, id);
            return producto;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    
}
