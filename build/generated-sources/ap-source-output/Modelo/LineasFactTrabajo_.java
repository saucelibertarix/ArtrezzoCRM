package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LineasFactTrabajo.class)
public abstract class LineasFactTrabajo_ {

	public static volatile SingularAttribute<LineasFactTrabajo, Integer> factTrabajoId;
	public static volatile SingularAttribute<LineasFactTrabajo, Double> precio;
	public static volatile SingularAttribute<LineasFactTrabajo, Factura> factura;
	public static volatile SingularAttribute<LineasFactTrabajo, Trabajo> trabajo;
	public static volatile SingularAttribute<LineasFactTrabajo, String> concepto;
	public static volatile SingularAttribute<LineasFactTrabajo, Double> totalLinea;
	public static volatile SingularAttribute<LineasFactTrabajo, Integer> cantidad;

}

