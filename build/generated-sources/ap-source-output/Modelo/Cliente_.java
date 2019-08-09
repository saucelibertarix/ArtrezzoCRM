package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> clienteNombre;
	public static volatile SingularAttribute<Cliente, String> dniCif;
	public static volatile SingularAttribute<Cliente, Integer> clienteTelefono;
	public static volatile SingularAttribute<Cliente, Integer> clienteId;
	public static volatile SetAttribute<Cliente, ?> facturas;
	public static volatile SetAttribute<Cliente, ?> presupuestos;
	public static volatile SingularAttribute<Cliente, String> clienteDireccion;

}

