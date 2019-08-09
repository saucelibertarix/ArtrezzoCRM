/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.LineaPresMaterial;
import Modelo.Material;
import Modelo.Presupuesto;
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
public class OperarLineaPresMaterial {
    
    public void crearLinea(Material material, Presupuesto presupuesto, String concepto, double precio, int cantidad, double subtotal){
        try{
            LineaPresMaterial lineaPresMaterial = new LineaPresMaterial(material, presupuesto, concepto, precio, cantidad, subtotal);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(lineaPresMaterial); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public List buscarLinea(Presupuesto presupuesto){
        List<LineaPresMaterial> listaResultados = null;
        try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session session;
            session = sesionFact.openSession(); 
            session.beginTransaction();
            String consulta = "FROM LineaPresMaterial lps WHERE lps.presupuesto.presupuestoId = '"+presupuesto.getPresupuestoId()+"'";
            Query query = session.createQuery(consulta);
            listaResultados = query.list();
 
            session.getTransaction().commit();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
        
        return listaResultados;  
    }
    
}
