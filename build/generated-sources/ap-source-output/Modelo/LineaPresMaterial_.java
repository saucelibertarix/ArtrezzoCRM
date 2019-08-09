package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LineaPresMaterial.class)
public abstract class LineaPresMaterial_ {

	public static volatile SingularAttribute<LineaPresMaterial, Presupuesto> presupuesto;
	public static volatile SingularAttribute<LineaPresMaterial, Double> precio;
	public static volatile SingularAttribute<LineaPresMaterial, Material> material;
	public static volatile SingularAttribute<LineaPresMaterial, Integer> presMaterialId;
	public static volatile SingularAttribute<LineaPresMaterial, Double> subtotal;
	public static volatile SingularAttribute<LineaPresMaterial, String> concepto;
	public static volatile SingularAttribute<LineaPresMaterial, Integer> cantidad;

}

