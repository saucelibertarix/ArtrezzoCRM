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
@Table(name="linea_pres_material")
public class LineaPresMaterial  implements Serializable {

    @Id
    @Column(name="pres_material_id")
    private Integer presMaterialId;
    @ManyToOne
    @JoinColumn(name="material_ref")
    private Material material;
    @ManyToOne
    @JoinColumn(name="presupuesto_id")
    private Presupuesto presupuesto;
    @Column(name="concepto")
    private String concepto;
    @Column(name="precio")
    private double precio;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="subtotal")
    private double subtotal;

    public LineaPresMaterial() {
    }

    public LineaPresMaterial(Material material, Presupuesto presupuesto, String concepto, double precio, int cantidad, double subtotal) {
       this.material = material;
       this.presupuesto = presupuesto;
       this.concepto = concepto;
       this.precio = precio;
       this.cantidad = cantidad;
       this.subtotal = subtotal;
    }
   
    public Integer getPresMaterialId() {
        return this.presMaterialId;
    }
    
    public void setPresMaterialId(Integer presMaterialId) {
        this.presMaterialId = presMaterialId;
    }
    public Material getMaterial() {
        return this.material;
    }
    
    public void setMaterial(Material material) {
        this.material = material;
    }
    public Presupuesto getPresupuesto() {
        return this.presupuesto;
    }
    
    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
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
    public double getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }




}


