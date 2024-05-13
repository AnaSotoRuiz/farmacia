package utilidades;

public class ValidarDatos {
	
	public static boolean validarNIF (String nif) {
		if (nif.length() !=9) {
			System.out.println("El NIF debe tener 9 caracteres.");
			return false;
		}
		
		String numeros = nif.substring(0,8);
		char letra = Character.toUpperCase(nif.charAt(8));
		
		for (int i=0; i<numeros.length(); i++) {
			if (!Character.isDigit(numeros.charAt(i))) {
				System.out.println("Los 8 primeros caracteres deben ser números");
				return false;
			}
			
		}
		
		if (!Character.isLetter(letra)) {
			System.out.println("El último carácter debe ser una letra");
			return false;
		}
		
		return true;
	}
	
	public static boolean validarNombre(String nombre) {
		if (nombre.isBlank()) {
			System.out.println("El nombre no puede estar en blanco");
			return false;
		}
		return true;
	}
	
	public static boolean validarDireccion(String direccion) {
		if (direccion.isBlank()) {
			System.out.println("La dirección no puede estar en blanco");
			return false;
		}
		return true;
	}
	
	public static boolean validarTelefono(String telefono) {
		if (telefono.length() !=9) {
			System.out.println("El teléfono debe tener 9 digitos");
			return false;
		}
		
		if (!telefono.matches("\\d+")) {
			System.out.println("El teléfono debe contener solo números");
			return false;
		}
		return true;
	}
	
	public static boolean validarCodigo(String codigo) {
		if (codigo.isBlank()) {
			System.out.println("El código del producto no puede estar en blanco");
			return false;
		}
		return true;
	}
	
	public static boolean validarNombreProducto(String nombre) {
		if (nombre.isBlank()) {
			System.out.println("El nombre no puede estar en blanco");
			return false;
		}
		return true;
	}
	
	public static boolean validarDescripcion(String descripcion) {
		if (descripcion.isBlank()) {
			System.out.println("La descripcion del producto no puede estar en blanco");
			return false;
		}
		return true;
	}
	
	public static boolean validarPrecio(double precio) {
		if (precio <= 0) {
			System.out.println("El precio debe ser mayor que cero");
			return false;
		}
		return true;
	}
	
	public static boolean validarUnidades(int unidades) {
		if (unidades <= 0) {
			System.out.println("Las unidades deben ser mayor que cero");
			return false;
		}
		return true;
	}
	
	public static boolean validarComoTomar (String comoTomar) {
		if (comoTomar.isBlank()) {
			System.out.println("Debe indicar como tomar el medicamento");
			return false;
		}
		return true;
	}
	
	public static boolean validarEfectoAdversos (String efectosAdversos) {
		if (efectosAdversos.isBlank()) {
			System.out.println("Debe indicar los efectos adversos del medicamento");
			return false;
		}
		return true;
	}
	
	public static boolean validarDosisUnidades(int dosisUnidades) {
		if (dosisUnidades <= 0) {
			System.out.println("El número de dosis por unidades debe ser mayor que cero");
			return false;
		}
		return true;
	}
	
	public static boolean validarDescuento(double descuento) {
		if (descuento < 0 || descuento > 40) {
			System.out.println("El descuento no puede superar el 40%");
			return false;
		}
		return true;
	}
	
}
