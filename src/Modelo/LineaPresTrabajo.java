package Modelo;
// Generated 25-jul-2019 15:40:37 by Hibernate Tools 4.3.1

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="linea_pres_trabajo")
public class LineaPresTrabajo  implements Serializable {

    @Id
    @Column(name="pres_trabajo_id")
    private int presTrabajoId;
    @ManyToOne
    @JoinColumn(name="presupuesto_id")
    private Presupuesto presupuesto;
    @ManyToOne
    @JoinColumn(name="trabajo_id")
    private Trabajo trabajo;
    @Column(name="concepto")
    private String concepto;
    @Column(name="precio")
    private double precio;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="total_linea")
    private double totalLinea;

    public LineaPresTrabajo() {
    }

    public LineaPresTrabajo(Trabajo trabajo, Presupuesto presupuesto, String concepto, double precio, int cantidad, double totalLinea) {
       this.presupuesto = presupuesto;
       this.trabajo = trabajo;
       this.concepto = concepto;
       this.precio = precio;
       this.cantidad = cantidad;
       this.totalLinea = totalLinea;
    }
   
    public int getPresTrabajoId() {
        return this.presTrabajoId;
    }
    
    public void setPresTrabajoId(int presTrabajoId) {
        this.presTrabajoId = presTrabajoId;
    }
    public Presupuesto getPresupuesto() {
        return this.presupuesto;
    }
    
    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }
    public Trabajo getTrabajo() {
        return this.trabajo;
    }
    
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
    public String getConcepto() {
        return this.concepto;
    }
    
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getTotalLinea() {
        return this.totalLinea;
    }
    
    public void setTotalLinea(double totalLinea) {
        this.totalLinea = totalLinea;
    }




}


