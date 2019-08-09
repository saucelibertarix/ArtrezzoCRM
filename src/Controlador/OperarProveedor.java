/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Proveedor;
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
public class OperarProveedor {
    
     public void crearProveedor(String proveedorNombre,String cif,  int proveedorTelefono, String proveedorDireccion){
        try{
            Proveedor proveedor = new Proveedor(cif, proveedorNombre, proveedorTelefono, proveedorDireccion);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(proveedor); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            session.close();
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public void modificarProveedor(int proveedorId, String proveedorNombre, String cif, int proveedorTelefono, String proveedorDireccion){
        
       SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
         Session sesion;
         sesion = sesionFact.openSession();
        if(proveedorNombre.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT p.proveedorNombre FROM Proveedor p WHERE p.proveedorId = '"+proveedorId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> nombre = query.list();
            for(int x = 0; x<nombre.size();x++){
                proveedorNombre = nombre.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            proveedorNombre = proveedorNombre;
        }
        if(cif.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT p.cif FROM Proveedor p WHERE p.proveedorId = '"+proveedorId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> ncif = query.list();
            for(int x = 0; x<ncif.size();x++){
                cif = ncif.get(x);
            }
            sesion.getTransaction().commit();
        }else{
           cif = cif;
        }
        if(proveedorTelefono==0){
            sesion.beginTransaction();
            String consulta = "SELECT p.proveedorTelefono FROM Proveedor p WHERE p.proveedorId = '"+proveedorId+"'";
            Query query = sesion.createQuery(consulta);
            List <Integer> telefono = query.list();
            for(int x = 0; x<telefono.size();x++){
                proveedorTelefono = telefono.get(x).intValue();
            }
            sesion.getTransaction().commit();
        }else{
            proveedorTelefono = proveedorTelefono;
        }
        if(proveedorDireccion.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT p.proveedorDireccion FROM Proveedor p WHERE p.proveedorId = '"+proveedorId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> direccion = query.list();
            for(int x = 0; x<direccion.size();x++){
                proveedorDireccion = direccion.get(x);
            }
            
            sesion.getTransaction().commit();
        }else{
            proveedorDireccion =proveedorDireccion;
        }
        
        try{
           
            sesion.beginTransaction();
            String consulta = "UPDATE Proveedor p SET "
                    + "p.proveedorNombre ='"+proveedorNombre+"',p.cif='"+cif+"', "
                            + "p.proveedorTelefono='"+proveedorTelefono+"', "
                                    + "p.proveedorDireccion='"+proveedorDireccion+"' "
                                            + "WHERE p.proveedorId = '"+proveedorId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public void borrarProveedor(int proveedorId){
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "DELETE FROM Proveedor p "
                                            + "WHERE p.proveedorId = '"+proveedorId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public List buscarProveedor( String cifBusqueda, String proveedorBusqueda){
        List<Proveedor> listaResultados = null;
        if(proveedorBusqueda.isEmpty()){
            if(cifBusqueda.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Proveedor";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Proveedor p WHERE p.cif LIKE '%"+cifBusqueda
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }else{
            if(cifBusqueda.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Proveedor p WHERE p.proveedorNombre LIKE '%"+proveedorBusqueda
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Proveedor p WHERE p.cif LIKE '%"+cifBusqueda
                        +"%' AND proveedorNombre LIKE '%"+proveedorBusqueda+"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }
        return listaResultados;
    }
    public List listarProveedores(){
        List <Proveedor> proveedores;
        SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Proveedor";
        Query query = sesion.createQuery(consulta);
        proveedores = query.list();
        sesion.getTransaction().commit();
        return proveedores;
    }
    
     public List buscarProveedorPorNombre(String proveedorBusqueda){
        List<Proveedor> listaResultados = null;
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Proveedor p WHERE p.proveedorNombre LIKE '%"+proveedorBusqueda
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        sesion.getTransaction().commit();
            
        return listaResultados;
    }
     
      public int buscarProveedorIdPorNombre(String nombreBuscado){
        List<Proveedor> listaResultados;
        int id = 0;
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Proveedor WHERE proveedorNombre LIKE '%"+nombreBuscado
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        for(int x=0;x<listaResultados.size();x++){
            id=listaResultados.get(x).getProveedorId();
        }
        sesion.getTransaction().commit();
        return id;    
    }
      
}
