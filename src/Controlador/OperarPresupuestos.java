/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Presupuesto;
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
public class OperarPresupuestos {
    
    
    
    public void crearPresupuesto(Cliente cliente, String presupuestoTrabajo, double presupuestoTotal){
        try{
            Presupuesto presupuesto = new Presupuesto(cliente, presupuestoTrabajo, presupuestoTotal);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(presupuesto); 
 
            session.getTransaction().commit();
            session.close();
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public void modificarPresupuesto(int presupuestoId, Cliente cliente, 
            String presupuestoTrabajo,double presupuestoTotal){
        
        try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "UPDATE Presupuesto p SET "
                    + "p.cliente ='"+cliente+"', p.presupuestoTrabajo='"+presupuestoTrabajo+"', "
                            + "p.presupuestoTotal='"+presupuestoTotal+"' "
                                    + "WHERE p.presupuestoId = '"+presupuestoId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public void borrarFactura(int presupuestoId){
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "DELETE FROM Presupuesto p "
                                            + "WHERE p.presupuestoId = '"+presupuestoId+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public List buscarPresupuestos(int clienteBusqueda, String presupuestoTrabajo){
        List<Presupuesto> listaResultados = null;
        if(clienteBusqueda == 0){
            if(presupuestoTrabajo.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Presupuesto";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Presupuesto p WHERE p.presupuestoTrabajo LIKE '%"+presupuestoTrabajo
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }else{
            if(presupuestoTrabajo.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Presupuesto p WHERE p.cliente.clienteId ="+clienteBusqueda;
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Presupuesto p WHERE p.presupuestoTrabajo LIKE '%"+presupuestoTrabajo
                        +"%' AND p.cliente.clienteId = "+clienteBusqueda;
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }
        return listaResultados;
    }
    
     public Presupuesto buscarPresupuesto(int clienteBusqueda, String presupuestoTrabajo){
        Presupuesto presupuesto = new Presupuesto();
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Presupuesto p WHERE p.cliente.clienteId='"+clienteBusqueda+"' "
        + "AND p.presupuestoTrabajo LIKE '%"+presupuestoTrabajo+"%'";
        Query query  = sesion.createQuery(consulta);
        List<Presupuesto> lista = query.list();
        presupuesto.setPresupuestoId(lista.get(0).getPresupuestoId());
        presupuesto.setCliente(lista.get(0).getCliente());
        presupuesto.setPresupuestoTrabajo(lista.get(0).getPresupuestoTrabajo());
        presupuesto.setPresupuestoTotal(lista.get(0).getPresupuestoTotal());
        sesion.getTransaction().commit();
           
        return presupuesto;
    }
    
    public void calcularTotal(Presupuesto presupuesto){
        
        double totalMaterial = 0;
        try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "SELECT subtotal FROM LineaPresMaterial lpm "
                                    +  "WHERE lpm.presupuesto.presupuestoId = '"+presupuesto.getPresupuestoId()+"'";
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
            String consulta = "SELECT totalLinea FROM LineaPresTrabajo lpt "
                                    + "WHERE lpt.presupuesto.presupuestoId = '"+presupuesto.getPresupuestoId()+"'";
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
            String consulta = "UPDATE Presupuesto p SET "
                            + "p.presupuestoTotal='"+total+"' "
                                    + "WHERE p.presupuestoId = '"+presupuesto.getPresupuestoId()+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
        
        
    }
    public double devolverTotal(Presupuesto presupuesto){
            double total=0;
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "FROM Presupuesto p WHERE p.presupuestoId = '"+presupuesto.getPresupuestoId()+"'";
            Query query = sesion.createQuery(consulta);
            List<Presupuesto> presupuestos = query.list();
            sesion.getTransaction().commit();
            for(Object o : presupuestos){
                Presupuesto presupuesto1 = (Presupuesto)o;
                total= presupuesto1.getPresupuestoTotal();
            }
            
            return total;
    }
}


