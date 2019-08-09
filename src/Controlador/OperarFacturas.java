/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import Modelo.Cliente;
import Vista.NewHibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author pfarinamoreno
 */
public class OperarFacturas {
    
     public void crearFactura(Cliente cliente, String facturaTrabajo, int facturaTotal){
        try{
            Factura factura = new Factura(cliente, facturaTrabajo, facturaTotal);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(factura); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            session.close();
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public void modificarFactura(int facturaId, Cliente cliente, 
            String facturaTrabajo, int facturaTotal){
        
        try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "UPDATE Factura f SET "
                    + "f.cliente ='"+cliente+"', f.facturaTrabajo='"+facturaTrabajo+"', "
                            + "f.facturaTotal='"+facturaTotal+"' "
                                    + "WHERE f.facturaId = '"+facturaId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public void borrarFactura(int facturaId){
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "DELETE FROM Factura f "
                                            + "WHERE f.facturaId = '"+facturaId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    public List buscarFactura(int clienteBusqueda, String facturaTrabajo){
        List<Factura> listaResultados = null;
        if(clienteBusqueda == 0){
            if(facturaTrabajo.isEmpty()){
                
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Factura f WHERE f.facturaTrabajo LIKE '%"+facturaTrabajo
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }else{
            if(facturaTrabajo.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Factura f INNER JOIN Cliente c WHERE c.clienteId LIKE '%"+clienteBusqueda
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Factura f INNER JOIN Cliente c WHERE f.facturaTrabajo LIKE '%"+facturaTrabajo
                        +"%' AND c.clienteId LIKE '%"+clienteBusqueda+"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }
        return listaResultados;
    }
    
    public void calcularTotal(int facturaId){
        
        double totalMaterial = 0;
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "SELECT totalLinea FROM LineasFactMaterial INNER JOIN Factura f"
                                    + "WHERE f.facturaId = '"+facturaId+"'";
            Query query = sesion.createQuery(consulta);
            List<Object> rs = query.list();
            Iterator<Object> it = rs.iterator();
            while(it.hasNext()){
                double totalLinea = (double)it.next();
                totalMaterial = totalMaterial + totalLinea;
            }
            
            sesion.getTransaction().commit();  
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
        
        double totalTrabajo = 0;
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "SELECT totalLinea FROM LineasFactTrabajo INNER JOIN Factura f"
                                    + "WHERE f.facturaId = '"+facturaId+"'";
            Query query = sesion.createQuery(consulta);
            List<Object> rs = query.list();
            Iterator<Object> it = rs.iterator();
            while(it.hasNext()){
                double totalLinea = (double)it.next();
                totalTrabajo = totalTrabajo + totalLinea;
            }
            
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
        
        double total = totalMaterial+totalTrabajo;
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "UPDATE Factura f SET "
                            + "f.facturaTotal='"+total+"' "
                                    + "WHERE f.facturaId = '"+facturaId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
        
        
    }
    
}
