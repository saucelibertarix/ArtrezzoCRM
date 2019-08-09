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
@Table(name="presupuesto")
public class Presupuesto  implements Serializable {

    @Id
    @Column(name="presupuesto_id")
    private Integer presupuestoId;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    @Column(name="presupuesto_trabajo")
    private String presupuestoTrabajo;
    @Column(name="presupuesto_total")
    private double presupuestoTotal;
    
    @OneToMany(mappedBy="presupuesto",cascade=CascadeType.ALL)
    private Set lineaPresTrabajos = new HashSet(0);
    @OneToMany(mappedBy="presupuesto",cascade=CascadeType.ALL)
    private Set lineaPresMaterials = new HashSet(0);

    public Presupuesto() {
    }

	
    public Presupuesto(Cliente cliente, String presupuestoTrabajo, double presupuestoTotal) {
        this.cliente = cliente;
        this.presupuestoTrabajo = presupuestoTrabajo;
        this.presupuestoTotal = presupuestoTotal;
    }
    public Presupuesto(Cliente cliente, String presupuestoTrabajo, double presupuestoTotal, Set lineaPresTrabajos, Set lineaPresMaterials) {
       this.cliente = cliente;
       this.presupuestoTrabajo = presupuestoTrabajo;
       this.presupuestoTotal = presupuestoTotal;
       this.lineaPresTrabajos = lineaPresTrabajos;
       this.lineaPresMaterials = lineaPresMaterials;
    }
   
    public Integer getPresupuestoId() {
        return this.presupuestoId;
    }
    
    public void setPresupuestoId(Integer presupuestoId) {
        this.presupuestoId = presupuestoId;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getPresupuestoTrabajo() {
        return this.presupuestoTrabajo;
    }
    
    public void setPresupuestoTrabajo(String presupuestoTrabajo) {
        this.presupuestoTrabajo = presupuestoTrabajo;
    }
    public double getPresupuestoTotal() {
        return this.presupuestoTotal;
    }
    
    public void setPresupuestoTotal(double presupuestoTotal) {
        this.presupuestoTotal = presupuestoTotal;
    }
    public Set getLineaPresTrabajos() {
        return this.lineaPresTrabajos;
    }
    
    public void setLineaPresTrabajos(Set lineaPresTrabajos) {
        this.lineaPresTrabajos = lineaPresTrabajos;
    }
    public Set getLineaPresMaterials() {
        return this.lineaPresMaterials;
    }
    
    public void setLineaPresMaterials(Set lineaPresMaterials) {
        this.lineaPresMaterials = lineaPresMaterials;
    }




}


