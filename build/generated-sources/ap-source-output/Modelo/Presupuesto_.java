package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Presupuesto.class)
public abstract class Presupuesto_ {

	public static volatile SingularAttribute<Presupuesto, Integer> presupuestoId;
	public static volatile SingularAttribute<Presupuesto, Cliente> cliente;
	public static volatile SetAttribute<Presupuesto, ?> lineaPresTrabajos;
	public static volatile SingularAttribute<Presupuesto, Double> presupuestoTotal;
	public static volatile SingularAttribute<Presupuesto, String> presupuestoTrabajo;
	public static volatile SetAttribute<Presupuesto, ?> lineaPresMaterials;

}

