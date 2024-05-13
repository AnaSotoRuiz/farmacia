package estructuraDatos;
import java.io.Serializable;

public class Cliente  implements Serializable{
	private static final long serialVersionUID = -3748049660914701526L;
	private String id;
	private String nombre;
	private String direccion;
	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}


	private String telefono;
	private boolean baja;
	
	//constructor
	public Cliente(String id, String nombre, String direccion, String telefono) {
		this.id= id;
		this.nombre= nombre;
		this.direccion= direccion;
		this.telefono= telefono;
		this.baja= false;		
	}
	
	public Cliente(Cliente c) {
		this.id= c.id;
		this.nombre= c.nombre;
		this.direccion= c.direccion;
		this.telefono= c.telefono;
		this.baja= false;
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String toString() {
		return "Cliente{" + "id='" + id + '\''+
				", nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				", telefono='" + telefono + '\'' +
				'}';
	}

	

}
