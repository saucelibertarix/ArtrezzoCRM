package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LineaPresTrabajo.class)
public abstract class LineaPresTrabajo_ {

	public static volatile SingularAttribute<LineaPresTrabajo, Presupuesto> presupuesto;
	public static volatile SingularAttribute<LineaPresTrabajo, Double> precio;
	public static volatile SingularAttribute<LineaPresTrabajo, Integer> presTrabajoId;
	public static volatile SingularAttribute<LineaPresTrabajo, Trabajo> trabajo;
	public static volatile SingularAttribute<LineaPresTrabajo, String> concepto;
	public static volatile SingularAttribute<LineaPresTrabajo, Double> totalLinea;
	public static volatile SingularAttribute<LineaPresTrabajo, Integer> cantidad;

}

