package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Factura.class)
public abstract class Factura_ {

	public static volatile SingularAttribute<Factura, Cliente> cliente;
	public static volatile SingularAttribute<Factura, String> facturaTrabajo;
	public static volatile SingularAttribute<Factura, Integer> facturaId;
	public static volatile SetAttribute<Factura, ?> lineasFactMaterials;
	public static volatile SingularAttribute<Factura, Double> facturaTotal;
	public static volatile SetAttribute<Factura, ?> lineasFactTrabajos;

}

