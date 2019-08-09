package Modelo;
// Generated 25-jul-2019 15:40:37 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura  implements Serializable {

    @Id
    @Column(name="factura_id")
    private Integer facturaId;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    @Column(name="factura_trabajo")
    private String facturaTrabajo;
    @Column(name="factura_total")
    private double facturaTotal;
    
    @OneToMany(mappedBy="factura",cascade= CascadeType.ALL)
    private Set lineasFactMaterials = new HashSet(0);
    @OneToMany(mappedBy="factura",cascade= CascadeType.ALL)
    private Set lineasFactTrabajos = new HashSet(0);

    public Factura() {
    }

	
    public Factura(Cliente cliente, String facturaTrabajo, double facturaTotal) {
        this.cliente = cliente;
        this.facturaTrabajo = facturaTrabajo;
        this.facturaTotal = facturaTotal;
    }
    public Factura(Cliente cliente, String facturaTrabajo, double facturaTotal, Set lineasFactMaterials, Set lineasFactTrabajos) {
       this.cliente = cliente;
       this.facturaTrabajo = facturaTrabajo;
       this.facturaTotal = facturaTotal;
       this.lineasFactMaterials = lineasFactMaterials;
       this.lineasFactTrabajos = lineasFactTrabajos;
    }
   
    public Integer getFacturaId() {
        return this.facturaId;
    }
    
    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getFacturaTrabajo() {
        return this.facturaTrabajo;
    }
    
    public void setFacturaTrabajo(String facturaTrabajo) {
        this.facturaTrabajo = facturaTrabajo;
    }
    public double getFacturaTotal() {
        return this.facturaTotal;
    }
    
    public void setFacturaTotal(double facturaTotal) {
        this.facturaTotal = facturaTotal;
    }
    public Set getLineasFactMaterials() {
        return this.lineasFactMaterials;
    }
    
    public void setLineasFactMaterials(Set lineasFactMaterials) {
        this.lineasFactMaterials = lineasFactMaterials;
    }
    public Set getLineasFactTrabajos() {
        return this.lineasFactTrabajos;
    }
    
    public void setLineasFactTrabajos(Set lineasFactTrabajos) {
        this.lineasFactTrabajos = lineasFactTrabajos;
    }




}


