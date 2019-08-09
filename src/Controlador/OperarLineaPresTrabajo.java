/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.LineaPresTrabajo;
import Modelo.Presupuesto;
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
public class OperarLineaPresTrabajo {
    
     public void crearLinea(Trabajo trabajo, Presupuesto presupuesto, String concepto, double precio, int cantidad, double subtotal){
        try{
            LineaPresTrabajo lineaPresTrabajo = new LineaPresTrabajo(trabajo, presupuesto, concepto, precio, cantidad, subtotal); 
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(lineaPresTrabajo); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public List buscarLinea(Presupuesto presupuesto){
        List<LineaPresTrabajo> listaResultados = null;
        try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session session;
            session = sesionFact.openSession(); 
            session.beginTransaction();
            String consulta = "FROM LineaPresTrabajo lps WHERE lps.presupuesto.presupuestoId = '"+presupuesto.getPresupuestoId()+"'";
            Query query = session.createQuery(consulta);
            listaResultados = query.list();
 
            session.getTransaction().commit();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
        
        return listaResultados;  
    }
    
}
