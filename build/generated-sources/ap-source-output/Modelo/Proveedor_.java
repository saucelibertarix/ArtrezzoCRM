package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedor.class)
public abstract class Proveedor_ {

	public static volatile SingularAttribute<Proveedor, String> cif;
	public static volatile SingularAttribute<Proveedor, String> proveedorNombre;
	public static volatile SingularAttribute<Proveedor, Integer> proveedorId;
	public static volatile SetAttribute<Proveedor, ?> materials;
	public static volatile SingularAttribute<Proveedor, Integer> proveedorTelefono;
	public static volatile SingularAttribute<Proveedor, String> proveedorDireccion;

}

