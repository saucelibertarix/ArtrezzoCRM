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
@Table(name="material")
public class Material  implements Serializable {

    @Id
    @Column(name="material_ref")
    private Integer materialRef;
    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedor proveedor;
    @Column(name="material_nombre")
    private String materialNombre;
    @Column(name="material_comentario")
    private String materialComentario;
    @Column(name="material_precio")
    private double materialPrecio;
    
    @OneToMany(mappedBy="material",cascade= CascadeType.ALL )
    private Set lineasFactMaterials = new HashSet(0);
    @OneToMany(mappedBy="material",cascade= CascadeType.ALL)
    private Set lineaPresMaterials = new HashSet(0);

    public Material() {
    }

	
    public Material(Proveedor proveedor, String materialNombre, String materialComentario, double materialPrecio) {
        this.proveedor = proveedor;
        this.materialNombre = materialNombre;
        this.materialComentario = materialComentario;
        this.materialPrecio = materialPrecio;
    }
    public Material(Proveedor proveedor, String materialNombre, String materialComentario, double materialPrecio, Set lineasFactMaterials, Set lineaPresMaterials) {
       this.proveedor = proveedor;
       this.materialNombre = materialNombre;
       this.materialComentario = materialComentario;
       this.materialPrecio = materialPrecio;
       this.lineasFactMaterials = lineasFactMaterials;
       this.lineaPresMaterials = lineaPresMaterials;
    }
   
    public Integer getMaterialRef() {
        return this.materialRef;
    }
    
    public void setMaterialRef(Integer materialRef) {
        this.materialRef = materialRef;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public String getMaterialNombre() {
        return this.materialNombre;
    }
    
    public void setMaterialNombre(String materialNombre) {
        this.materialNombre = materialNombre;
    }
    public String getMaterialComentario() {
        return this.materialComentario;
    }
    
    public void setMaterialComentario(String materialComentario) {
        this.materialComentario = materialComentario;
    }
    public double getMaterialPrecio() {
        return this.materialPrecio;
    }
    
    public void setMaterialPrecio(double materialPrecio) {
        this.materialPrecio = materialPrecio;
    }
    public Set getLineasFactMaterials() {
        return this.lineasFactMaterials;
    }
    
    public void setLineasFactMaterials(Set lineasFactMaterials) {
        this.lineasFactMaterials = lineasFactMaterials;
    }
    public Set getLineaPresMaterials() {
        return this.lineaPresMaterials;
    }
    
    public void setLineaPresMaterials(Set lineaPresMaterials) {
        this.lineaPresMaterials = lineaPresMaterials;
    }

}


