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
@Table(name="proveedor")
public class Proveedor  implements Serializable {

    @Id
    @Column(name="proveedor_id")
    private Integer proveedorId;
    @Column(name="cif")
    private String cif;
    @Column(name="proveedor_nombre")
    private String proveedorNombre;
    @Column(name="proveedor_telefono")
    private int proveedorTelefono;
    @Column(name="proveedor_direccion")
    private String proveedorDireccion;
    
    @OneToMany(mappedBy="proveedor",cascade= CascadeType.ALL)
    private Set materials = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String cif, String proveedorNombre, int proveedorTelefono, String proveedorDireccion) {
        this.cif = cif;
        this.proveedorNombre = proveedorNombre;
        this.proveedorTelefono = proveedorTelefono;
        this.proveedorDireccion = proveedorDireccion;
    }
    public Proveedor(String cif, String proveedorNombre, int proveedorTelefono, String proveedorDireccion, Set materials) {
       this.cif = cif;
       this.proveedorNombre = proveedorNombre;
       this.proveedorTelefono = proveedorTelefono;
       this.proveedorDireccion = proveedorDireccion;
       this.materials = materials;
    }
   
    public Integer getProveedorId() {
        return this.proveedorId;
    }
    
    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getProveedorNombre() {
        return this.proveedorNombre;
    }
    
    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }
    public int getProveedorTelefono() {
        return this.proveedorTelefono;
    }
    
    public void setProveedorTelefono(int proveedorTelefono) {
        this.proveedorTelefono = proveedorTelefono;
    }
    public String getProveedorDireccion() {
        return this.proveedorDireccion;
    }
    
    public void setProveedorDireccion(String proveedorDireccion) {
        this.proveedorDireccion = proveedorDireccion;
    }
    public Set getMaterials() {
        return this.materials;
    }
    
    public void setMaterials(Set materials) {
        this.materials = materials;
    }




}


