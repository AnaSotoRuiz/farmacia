package gestorFarmacia;

import java.util.ArrayList;
import java.util.Scanner;

import estructuraDatos.Cliente;
import estructuraDatos.Producto;
import utilidades.IO_ES;
import utilidades.MetodosFarmacia;

public class programaFarmacia {

	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Producto> productos = new ArrayList<>();
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		MetodosFarmacia.cargarDatos(clientes, productos);

		int opcion = 0;

		do {
			mostrarMenuPrincipal();
			try {
				opcion = entrada.nextInt();
			} catch (Exception ex) {}
			entrada.nextLine();

			switch (opcion) {
			case 1:
				mostrarMenuClientes();
				break;
			case 2:
				mostrarMenuProductos();
				break;
			case 3:
				guardarDatos();
				break;
			case 4:
				System.out.println("Saliendo del programa");
				guardarDatos();
				break;
			default:
				System.out.println("Opción no valida");
			}

		} while (opcion != 4);

	}

	private static void mostrarMenuPrincipal() {
		System.out.println("╔════════════════════ MENÚ PRINCIPAL ════════════════════╗");
	    System.out.println("║ 1. Gestión de clientes                                 ║");
	    System.out.println("║ 2. Gestión de productos                                ║");
	    System.out.println("║ 3. Guardar datos                                       ║");
	    System.out.println("║ 4. Salir                                               ║");
	    System.out.println("╚════════════════════════════════════════════════════════╝");
	}

	private static void mostrarMenuClientes() {
		int opcion;
		do {
			System.out.println("╔═════════════════════════ MENÚ GESTIÓN DE CLIENTES ═════════════════════════╗");
		    System.out.println("║ 1. Dar de alta un cliente nuevo                                            ║");
		    System.out.println("║ 2. Buscar cliente por NIF                                                  ║");
		    System.out.println("║ 3. Dar de baja un cliente                                                  ║");
		    System.out.println("║ 4. Modificar datos del cliente                                             ║");
		    System.out.println("║ 5. Listar clientes                                                         ║");
		    System.out.println("║ 6. Salir                                                                   ║");
		    System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");

			opcion = entrada.nextInt();
			entrada.nextLine();

			switch (opcion) {
			case 1:
				MetodosFarmacia.altaCliente(clientes);
				break;
			case 2:
				MetodosFarmacia.buscarClienteNif(clientes);
				break;
			case 3:
				MetodosFarmacia.bajaCliente(clientes);
				break;
			case 4:
				MetodosFarmacia.modificarCliente(clientes);
				break;
			case 5:
				MetodosFarmacia.listarClientes(clientes);
				break;
			case 6:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Opción no válida");

			}
		} while (opcion != 6);
	}

	private static void mostrarMenuProductos() {
		int opcion;
		do {
			System.out.println("╔═════════════════════════ MENÚ GESTIÓN DE PRODUCTOS ════════════════════════╗");
		    System.out.println("║ 1. Dar de alta un producto                                                 ║");
		    System.out.println("║ 2. Buscar producto                                                         ║");
		    System.out.println("║ 3. Dar de baja un producto                                                 ║");
		    System.out.println("║ 4. Modificar datos del producto                                            ║");
		    System.out.println("║ 5. Listar productos                                                        ║");
		    System.out.println("║ 6. Salir                                                                   ║");
		    System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");

			opcion = entrada.nextInt();
			entrada.nextLine();

			switch (opcion) {
			case 1:
				MetodosFarmacia.altaProducto(productos);
				break;
			case 2:
				MetodosFarmacia.buscarProductoCodigo(productos);
				break;
			case 3:
				MetodosFarmacia.altaProducto(productos);
				break;
			case 4:
				MetodosFarmacia.modificarProducto(productos);
				break;
			case 5:
				MetodosFarmacia.listarProductos(productos);
				break;
			case 6:
				System.out.println("Saliendo del programa");
			default:
				System.out.println("Opción no valida");
			}
		} while (opcion != 6);

	}

	public static void guardarDatos() {
		IO_ES io = new IO_ES(clientes, productos);
		try {
			io.escribirDatos();
		} catch (Exception e) {
			System.out.println("Error al guardar los datos " + e.getMessage());
		}
	}

}
