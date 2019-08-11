/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Material;
import Modelo.Proveedor;
import Controlador.OperarProveedor;
import Vista.NewHibernateUtil;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author pfarinamoreno
 */
public class OperarMateriales {
    
     public void crearMaterial(Proveedor proveedor, String materialNombre, String materialComentario, double materialPrecio){
        try{
            Material material = new Material(proveedor, materialNombre, materialComentario, materialPrecio);  //Creamos el objeto
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();//Cogemos una sesion de la factoria de sesiones
            Session session;
            session = sesionFact.openSession(); //iniciamos la sesion
            session.beginTransaction();//iniciamos una transaccion
 
            session.save(material); //<|--- Aqui guardamos el objeto en la base de datos.
 
            session.getTransaction().commit();
            session.close();
        }catch(HibernateException ex){
            ex.printStackTrace();
        } 
    }
    
    public void modificarMaterial(int materialRef, Proveedor proveedor, String materialNombre, String materialComentario, double materialPrecio){
        
         SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
         Session sesion;
         sesion = sesionFact.openSession();
        if(materialNombre.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT m.materialNombre FROM Material m WHERE m.materialRef = '"+materialRef+"'";
            Query query = sesion.createQuery(consulta);
            List <String> nombre = query.list();
            for(int x = 0; x<nombre.size();x++){
                materialNombre = nombre.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            materialNombre = materialNombre;
        }
        
        if(materialComentario.isEmpty()){
            sesion.beginTransaction();
            String consulta = "SELECT m.materialComentario FROM Material m WHERE m.materialRef = '"+materialRef+"'";
            Query query = sesion.createQuery(consulta);
            List <String> comentario = query.list();
            for(int x = 0; x<comentario.size();x++){
               materialComentario = comentario.get(x);
            }
            sesion.getTransaction().commit();
        }else{
            materialComentario = materialComentario;
        }
        if(materialPrecio==0){
            sesion.beginTransaction();
            String consulta = "SELECT m.materialPrecio FROM Material m WHERE m.materialRef = '"+materialRef+"'";
            Query query = sesion.createQuery(consulta);
            List <Double> precio = query.list();
            for(int x = 0; x<precio.size();x++){
                materialPrecio = precio.get(x).doubleValue();
            }
            
            sesion.getTransaction().commit();
        }else{
            materialPrecio =materialPrecio;
        }
        try{

            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "UPDATE Material m SET "
                    + "m.proveedor.proveedorId ='"+proveedor.getProveedorId()+"', m.materialNombre='"+materialNombre+"', "
                            + "m.materialComentario='"+materialComentario+"', "
                                    + "m.materialPrecio='"+materialPrecio+"' "
                                            + "WHERE m.materialRef = '"+materialRef+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public void borrarMaterial(int materialRef){
         try{
            SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
            Session sesion;
            sesion = sesionFact.openSession();
            sesion.beginTransaction();
            String consulta = "DELETE FROM Material m "
                                            + "WHERE m.materialRef = '"+materialRef+"'";
            Query query = sesion.createQuery(consulta);
            query.executeUpdate();
            sesion.getTransaction().commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }      
    }
    
    public List buscarMaterial(int proveedorBusqueda, String materialNombre){
        List<Material> listaResultados = null;
        if(proveedorBusqueda==0){
            if(materialNombre.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Material";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Material m WHERE m.materialNombre LIKE '%"+materialNombre
                        +"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }else{
            if(materialNombre.isEmpty()){
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                //String consulta = "FROM Material";
                String consulta = "FROM Material m  WHERE m.proveedor.proveedorId = "+proveedorBusqueda;
                Query query = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }else{
                SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
                Session sesion;
                sesion = sesionFact.openSession();
                sesion.beginTransaction();
                String consulta = "FROM Material m  WHERE m.proveedor.proveedorId = "+proveedorBusqueda
                        +" AND m.materialNombre LIKE '%"+materialNombre+"%'";
                Query query  = sesion.createQuery(consulta);
                listaResultados = query.list();
                sesion.getTransaction().commit();
            }
        }
        return listaResultados;
    }
    
    public Material buscarMaterial(String materialNombre){
        Material material = new Material();
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Material m WHERE m.materialNombre='"+materialNombre
                +"'";
        Query query  = sesion.createQuery(consulta);
        List<Material> lista = query.list();
        material.setMaterialRef(lista.get(0).getMaterialRef());
        material.setMaterialNombre(lista.get(0).getMaterialNombre());
        material.setProveedor(lista.get(0).getProveedor());
        material.setMaterialComentario(lista.get(0).getMaterialComentario());
        material.setMaterialPrecio(lista.get(0).getMaterialPrecio());
        sesion.getTransaction().commit();

        return material;
    }
    
     public List listarMateriales(){
        List <Material> materiales;
        SessionFactory sesionFact = NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Material";
        Query query = sesion.createQuery(consulta);
        materiales = query.list();
        sesion.getTransaction().commit();
        return materiales;
    }
    public List buscarMaterialPorNombre(String materialBusqueda){
        List<Material> listaResultados = null;
       
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Material m WHERE m.materialNombre LIKE '%"+materialBusqueda
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        sesion.getTransaction().commit();
            
        return listaResultados;
    }
    
    public int buscarMaterialIdPorNombre(String nombreBuscado){
        List<Material> listaResultados;
        int id = 0;
        SessionFactory sesionFact =  NewHibernateUtil.getSessionFactory();
        Session sesion;
        sesion = sesionFact.openSession();
        sesion.beginTransaction();
        String consulta = "FROM Material WHERE materialNombre LIKE '%"+nombreBuscado
                +"%'";
        Query query  = sesion.createQuery(consulta);
        listaResultados = query.list();
        for(int x=0;x<listaResultados.size();x++){
            id=listaResultados.get(x).getMaterialRef();
        }
        sesion.getTransaction().commit();
        return id;    
    }
     
}
