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
@Table(name="lineas_fact_trabajo")
public class LineasFactTrabajo  implements Serializable {

    @Id
    @Column(name="fact_trabajo_id")
    private Integer factTrabajoId;
    @ManyToOne
    @JoinColumn(name="factura_id")
    private Factura factura;
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

    public LineasFactTrabajo() {
    }

    public LineasFactTrabajo(Factura factura, Trabajo trabajo, String concepto, double precio, int cantidad, double totalLinea) {
       this.factura = factura;
       this.trabajo = trabajo;
       this.concepto = concepto;
       this.precio = precio;
       this.cantidad = cantidad;
       this.totalLinea = totalLinea;
    }
   
    public Integer getFactTrabajoId() {
        return this.factTrabajoId;
    }
    
    public void setFactTrabajoId(Integer factTrabajoId) {
        this.factTrabajoId = factTrabajoId;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
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


