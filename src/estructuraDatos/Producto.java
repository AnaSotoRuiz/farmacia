package estructuraDatos;
import java.io.Serializable;

public abstract class Producto implements Serializable {
	private static final long serialVersionUID = 4479431872410347031L;
	private String codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	private int unidades;
	private boolean baja;
		
	//Constructor
	public Producto(String codigo, String nombre, String descripcion, double precio, int unidades) {
		this.codigo= codigo;
		this.nombre= nombre;
		this.descripcion= descripcion;
		this.precio= precio;
		this.unidades= unidades;
	}
	
	public Producto (Producto c) {
		this.codigo= c.codigo;
		this.nombre= c.nombre;
		this.descripcion= c.descripcion;
		this.precio= c.precio;
		this.unidades= c.unidades;
	}
	
	//Metodo para comprobar el codigo
	public boolean comprobarCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}
	
	//Metodo para añadir unidades
	public boolean aniadirUnidades(int unidadesA) {
		if (unidadesA > 0) {
			this.unidades += unidadesA;
			return true;
		} else {
			return false;
		}
	}
	
	//Metodo para quitar unidades
	public boolean quitarUnidades(int unidadesQ) {
		if (unidadesQ > 0 && unidadesQ <= this.unidades) {
			this.unidades -= unidadesQ;
			return true;
		} else {
			return false;
		}
	}
	
	//Getters y Setters

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}
	
	public String toString() {
		return "Producto{" +
				"codigo='" + codigo + '\'' +
				", nombre='" + nombre + '\'' +
				", descripcion='" + descripcion + '\'' +
				", precio=" + precio +
				", unidades=" + unidades +
				',';
				
	} 
	

	
	

}
