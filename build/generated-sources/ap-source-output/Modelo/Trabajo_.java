package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trabajo.class)
public abstract class Trabajo_ {

	public static volatile SetAttribute<Trabajo, ?> lineaPresTrabajos;
	public static volatile SingularAttribute<Trabajo, String> trabajoNombre;
	public static volatile SingularAttribute<Trabajo, Double> precioHora;
	public static volatile SingularAttribute<Trabajo, Integer> trabajoId;
	public static volatile SingularAttribute<Trabajo, String> trabajoDescripcion;
	public static volatile SetAttribute<Trabajo, ?> lineasFactTrabajos;

}

