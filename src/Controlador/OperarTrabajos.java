/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Trabajo;
import Vista.NewHibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author pfarinamoreno
 */
public class OperarTrabajos {
    
     public void crearTrabajo(String trabajoNombre, String trabajoDescripcion, double precioHora){
        try{
            Trabajo trabajo = new Trabajo(trabajoNombre, trabajoDescripcion, precioHora);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(trabajo); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            session.close();
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public void modificarTrabajo(int trabajoId, String trabajoNombre, String trabajoDescripcion, double precioHora){
         SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
         Session sesion;
         sesion = sesionFact.openSession();
        if(trabajoNombre.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT trabajoNombre FROM Trabajo t WHERE t.trabajoId = '"+trabajoId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> nombre = query.list();
            for(int x = 0; x<nombre.size();x++){
                trabajoNombre = nombre.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            trabajoNombre = trabajoNombre;
        }
        if(trabajoDescripcion.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT trabajoDescripcion FROM Trabajo t WHERE t.trabajoId = '"+trabajoId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> descripcion = query.list();
            for(int x = 0; x<descripcion.size();x++){
                trabajoDescripcion = descripcion.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            trabajoDescripcion = trabajoDescripcion;
        }
        if(precioHora==0){
            sesion.beginTransaction();
            String consulta = "SELECT precioHora FROM Trabajo t WHERE t.trabajoId = '"+trabajoId+"'";
            Query query = sesion.createQuery(consulta);
            List <Double> precio = query.list();
            for(int x = 0; x<precio.size();x++){
                precioHora = precio.get(x).doubleValue();
            }
            sesion.getTransaction().commit();
        }else{
            precioHora = precioHora;
        }
        
        try{
            sesion.beginTransaction();
            String consulta = "UPDATE Trabajo t SET "
                    + "t.trabajoNombre='"+ trabajoNombre+"', t.trabajoDescripcion='"+ trabajoDescripcion+"', "
                            + "t.precioHora='"+precioHora+"' "
                                            + "WHERE t.trabajoId='"+trabajoId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public void borrarTrabajo(int trabajoId){
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "DELETE FROM Trabajo t WHERE t.trabajoId = '"+trabajoId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public List buscarTrabajo(String trabajoNombre, String trabajoDescripcion){
        List<Trabajo> listaResultados = null;
        if(trabajoNombre.isEmpty()){
            if(trabajoDescripcion.isEmpty()){
                 SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Trabajo";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Trabajo t WHERE t.trabajoDescripcion LIKE '%"+trabajoDescripcion
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }else{
            if(trabajoDescripcion.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Trabajo t WHERE t.trabajoNombre LIKE '%"+trabajoNombre
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Trabajo t WHERE t.trabajoNombre LIKE '%"+trabajoNombre
                        +"%' AND t.trabajoDescripcion LIKE '%"+trabajoDescripcion+"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }
        return listaResultados;
    }
    public List listarTrabajos(){
        List <Trabajo> trabajos;
        SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Trabajo";
        Query query = sesion.createQuery(consulta);
        trabajos = query.list();
        sesion.getTransaction().commit();
        return trabajos;
    }
    
     public List buscarTrabajoPorNombre(String trabajoBusqueda){
        List<Trabajo> listaResultados = null;
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Trabajo t WHERE t.trabajoNombre LIKE '%"+trabajoBusqueda
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        sesion.getTransaction().commit();
            
        return listaResultados;
    }
     
    public int buscarTrabajoIdPorNombre(String nombreBuscado){
        List<Trabajo> listaResultados;
        int id = 0;
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Trabajo t WHERE t.trabajoNombre LIKE '%"+nombreBuscado
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        for(int x=0;x<listaResultados.size();x++){
            id=listaResultados.get(x).getTrabajoId();
        }
        sesion.getTransaction().commit();
        return id;    
    }

}
