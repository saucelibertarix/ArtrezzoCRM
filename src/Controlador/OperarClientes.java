/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
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
public class OperarClientes {
    
    public void crearCliente(String dniCif, String clienteNombre, int clienteTelefono, String clienteDireccion){
        try{
            Cliente cliente = new Cliente(dniCif, clienteNombre, clienteTelefono, clienteDireccion);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(cliente); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public void modificarCliente(int clienteId, String clienteNombre, String dniCif, 
         int clienteTelefono, String clienteDireccion){
         SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
         Session sesion;
         sesion = sesionFact.openSession();
        if(clienteNombre.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT c.clienteNombre FROM Cliente c WHERE c.clienteId = '"+clienteId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> nombre = query.list();
            for(int x = 0; x<nombre.size();x++){
                clienteNombre = nombre.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            clienteNombre = clienteNombre;
        }
        if(dniCif.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT c.dniCif FROM Cliente c WHERE c.clienteId = '"+clienteId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> dnicif = query.list();
            for(int x = 0; x<dnicif.size();x++){
                dniCif = dnicif.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            dniCif = dniCif;
        }
        if(clienteTelefono==0){
            sesion.beginTransaction();
            String consulta = "SELECT c.clienteTelefono FROM Cliente c WHERE c.clienteId = '"+clienteId+"'";
            Query query = sesion.createQuery(consulta);
            List <Integer> telefono = query.list();
            for(int x = 0; x<telefono.size();x++){
                clienteTelefono = telefono.get(x).intValue();
            }
            sesion.getTransaction().commit();
        }else{
            clienteTelefono = clienteTelefono;
        }
        if(clienteDireccion.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT c.clienteDireccion FROM Cliente c WHERE c.clienteId = '"+clienteId+"'";
            Query query = sesion.createQuery(consulta);
            List <String> direccion = query.list();
            for(int x = 0; x<direccion.size();x++){
                clienteDireccion = direccion.get(x);
            }
            
            sesion.getTransaction().commit();
        }else{
            clienteDireccion = clienteDireccion;
        }
        
        try{
           
            sesion.beginTransaction();
            String consulta = "UPDATE Cliente c SET "
                    + "c.clienteNombre ='"+clienteNombre+"', c.dniCif='"+dniCif+"', "
                            + "c.clienteTelefono='"+clienteTelefono+"', "
                                    + "c.clienteDireccion='"+clienteDireccion+"' "
                                            + "WHERE c.clienteId = '"+clienteId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public void borrarCliente(int clienteId){
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "DELETE FROM Cliente c "
                                            + "WHERE c.clienteId = '"+clienteId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public List buscarCliente(String clienteBusqueda, String dniCifBusqueda){
        List<Cliente> listaResultados = null;
        if(clienteBusqueda.isEmpty()){
            if(dniCifBusqueda.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Cliente";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Cliente WHERE dniCif LIKE '%"+dniCifBusqueda
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }else{
            if(dniCifBusqueda.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Cliente WHERE clienteNombre LIKE '%"+clienteBusqueda
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Cliente WHERE dniCif LIKE '%"+dniCifBusqueda
                        +"%' AND clienteNombre LIKE '%"+clienteBusqueda+"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }
        return listaResultados;
    }
    
     public Cliente buscarCliente(String clienteBusqueda){
        Cliente cliente = new Cliente();
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Cliente WHERE clienteNombre LIKE '%"+clienteBusqueda
                +"%'";
        Query query  = sesion.createQuery(consulta);
        List<Cliente> lista = query.list();
        cliente.setClienteId(lista.get(0).getClienteId());
        cliente.setClienteNombre(lista.get(0).getClienteNombre());
        cliente.setDniCif(lista.get(0).getDniCif());
        cliente.setClienteDireccion(lista.get(0).getClienteDireccion());
        cliente.setClienteTelefono(lista.get(0).getClienteTelefono());
        sesion.getTransaction().commit();

        return cliente;
    }
    
    public List listarClientes(){
        List <Cliente> clientes;
        SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Cliente";
        Query query = sesion.createQuery(consulta);
        clientes = query.list();
        sesion.getTransaction().commit();
        return clientes;
    }
    
    public List buscarClientePorNombre(String clienteBusqueda){
        List<Cliente> listaResultados = null;
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Cliente WHERE clienteNombre LIKE '%"+clienteBusqueda
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        sesion.getTransaction().commit();
            
        return listaResultados;
    }
    
    public int buscarClienteIdPorNombre(String nombreBuscado){
        List<Cliente> listaResultados;
        int id = 0;
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Cliente WHERE clienteNombre LIKE '%"+nombreBuscado
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        for(int x=0;x<listaResultados.size();x++){
            id=listaResultados.get(x).getClienteId();
        }
        sesion.getTransaction().commit();
        return id;    
    }
        
    
}
