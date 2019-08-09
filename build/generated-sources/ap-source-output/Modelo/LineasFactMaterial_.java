package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LineasFactMaterial.class)
public abstract class LineasFactMaterial_ {

	public static volatile SingularAttribute<LineasFactMaterial, Double> precio;
	public static volatile SingularAttribute<LineasFactMaterial, Factura> factura;
	public static volatile SingularAttribute<LineasFactMaterial, Material> material;
	public static volatile SingularAttribute<LineasFactMaterial, Integer> factMaterialId;
	public static volatile SingularAttribute<LineasFactMaterial, String> concepto;
	public static volatile SingularAttribute<LineasFactMaterial, Double> totalLinea;
	public static volatile SingularAttribute<LineasFactMaterial, Integer> cantidad;

}

