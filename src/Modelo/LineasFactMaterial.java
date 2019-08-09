package Modelo;
// Generated 25-jul-2019 15:40:37 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="lineas_fact_material")
public class LineasFactMaterial  implements java.io.Serializable {

    @Id
    @Column(name="fact_material_id")
    private Integer factMaterialId;
    @ManyToOne
    @JoinColumn(name="factura_id")
    private Factura factura;
    @ManyToOne
    @JoinColumn(name="material_ref")
    private Material material;
    @Column(name="concepto")
    private String concepto;
    @Column(name="precio")
    private double precio;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="total_linea")
    private double totalLinea;

    public LineasFactMaterial() {
    }

    public LineasFactMaterial(Factura factura, Material material, String concepto, double precio, int cantidad, double totalLinea) {
       this.factura = factura;
       this.material = material;
       this.concepto = concepto;
       this.precio = precio;
       this.cantidad = cantidad;
       this.totalLinea = totalLinea;
    }
   
    public Integer getFactMaterialId() {
        return this.factMaterialId;
    }
    
    public void setFactMaterialId(Integer factMaterialId) {
        this.factMaterialId = factMaterialId;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Material getMaterial() {
        return this.material;
    }
    
    public void setMaterial(Material material) {
        this.material = material;
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


