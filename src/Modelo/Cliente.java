package Modelo;
// Generated 25-jul-2019 15:40:37 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente  implements Serializable {

    @Id
    @Column(name="cliente_id")
    private Integer clienteId;
    @Column(name="dni_cif")
    private String dniCif;
    @Column(name="cliente_nombre")
    private String clienteNombre;
    @Column(name="cliente_telefono")
    private int clienteTelefono;
    @Column(name="cliente_direcion")
    private String clienteDireccion;

    @OneToMany(mappedBy="cliente",cascade= CascadeType.ALL)
    private Set facturas = new HashSet(0);
    @OneToMany(mappedBy="cliente",cascade= CascadeType.ALL)
    private Set presupuestos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String dniCif, String clienteNombre, int clienteTelefono, String clienteDireccion) {
        this.dniCif = dniCif;
        this.clienteNombre = clienteNombre;
        this.clienteTelefono = clienteTelefono;
        this.clienteDireccion = clienteDireccion;
    }
    public Cliente(String dniCif, String clienteNombre, int clienteTelefono, String clienteDireccion, Set facturas, Set presupuestos) {
       this.dniCif = dniCif;
       this.clienteNombre = clienteNombre;
       this.clienteTelefono = clienteTelefono;
       this.clienteDireccion = clienteDireccion;
       this.facturas = facturas;
       this.presupuestos = presupuestos;
    }
   
    public Integer getClienteId() {
        return this.clienteId;
    }
    
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
    public String getDniCif() {
        return this.dniCif;
    }
    
    public void setDniCif(String dniCif) {
        this.dniCif = dniCif;
    }
    public String getClienteNombre() {
        return this.clienteNombre;
    }
    
    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }
    public int getClienteTelefono() {
        return this.clienteTelefono;
    }
    
    public void setClienteTelefono(int clienteTelefono) {
        this.clienteTelefono = clienteTelefono;
    }
    public String getClienteDireccion() {
        return this.clienteDireccion;
    }
    
    public void setClienteDireccion(String clienteDireccion) {
        this.clienteDireccion = clienteDireccion;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }
    public Set getPresupuestos() {
        return this.presupuestos;
    }
    
    public void setPresupuestos(Set presupuestos) {
        this.presupuestos = presupuestos;
    }




}


