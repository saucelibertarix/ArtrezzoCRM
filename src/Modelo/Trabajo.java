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
@Table(name="trabajo")
public class Trabajo  implements Serializable {

    @Id
    @Column(name="trabajo_id")
    private Integer trabajoId;
    @Column(name="trabajo_nombre")
    private String trabajoNombre;
    @Column(name="trabajo_despripcion")
    private String trabajoDescripcion;
    @Column(name="precio_hora")
    private double precioHora;
    
    @OneToMany(mappedBy="trabajo",cascade= CascadeType.ALL)
    private Set lineaPresTrabajos = new HashSet(0);
    @OneToMany(mappedBy="trabajo",cascade= CascadeType.ALL)
    private Set lineasFactTrabajos = new HashSet(0);

    public Trabajo() {
    }

	
    public Trabajo(String trabajoNombre, String trabajoDespripcion, double precioHora) {
        this.trabajoNombre = trabajoNombre;
        this.trabajoDescripcion = trabajoDespripcion;
        this.precioHora = precioHora;
    }
    public Trabajo(String trabajoNombre, String trabajoDespripcion, double precioHora, Set lineaPresTrabajos, Set lineasFactTrabajos) {
       this.trabajoNombre = trabajoNombre;
       this.trabajoDescripcion = trabajoDespripcion;
       this.precioHora = precioHora;
       this.lineaPresTrabajos = lineaPresTrabajos;
       this.lineasFactTrabajos = lineasFactTrabajos;
    }
   
    public Integer getTrabajoId() {
        return this.trabajoId;
    }
    
    public void setTrabajoId(Integer trabajoId) {
        this.trabajoId = trabajoId;
    }
    public String getTrabajoNombre() {
        return this.trabajoNombre;
    }
    
    public void setTrabajoNombre(String trabajoNombre) {
        this.trabajoNombre = trabajoNombre;
    }
    public String getTrabajoDescripcion() {
        return this.trabajoDescripcion;
    }
    
    public void setTrabajoDescripcion(String trabajoDescripcion) {
        this.trabajoDescripcion = trabajoDescripcion;
    }
    public double getPrecioHora() {
        return this.precioHora;
    }
    
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    public Set getLineaPresTrabajos() {
        return this.lineaPresTrabajos;
    }
    
    public void setLineaPresTrabajos(Set lineaPresTrabajos) {
        this.lineaPresTrabajos = lineaPresTrabajos;
    }
    public Set getLineasFactTrabajos() {
        return this.lineasFactTrabajos;
    }
    
    public void setLineasFactTrabajos(Set lineasFactTrabajos) {
        this.lineasFactTrabajos = lineasFactTrabajos;
    }

}


