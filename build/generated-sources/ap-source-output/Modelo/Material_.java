package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Material.class)
public abstract class Material_ {

	public static volatile SingularAttribute<Material, Integer> materialRef;
	public static volatile SetAttribute<Material, ?> lineasFactMaterials;
	public static volatile SingularAttribute<Material, String> materialComentario;
	public static volatile SingularAttribute<Material, Proveedor> proveedor;
	public static volatile SingularAttribute<Material, Double> materialPrecio;
	public static volatile SingularAttribute<Material, String> materialNombre;
	public static volatile SetAttribute<Material, ?> lineaPresMaterials;

}

