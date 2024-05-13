package utilidades;

import java.util.List;
import java.util.Scanner;

import estructuraDatos.Cliente;
import estructuraDatos.Medicamento;
import estructuraDatos.ParaFarmacia;
import estructuraDatos.Producto;

public class MetodosFarmacia {

	private static Scanner entrada = new Scanner(System.in);

	public static void altaCliente(List<Cliente> clientes) {
		String nif;
		String nombre;
		String direccion;
		String telefono;

		while (true) {
			System.out.println("Ingrese los siguientes datos para dar de alta a un cliente");

			while (true) {
				System.out.println("Ingrese el NIF del cliente:");
				nif = entrada.nextLine();
				if (!ValidarDatos.validarNIF(nif)) {
					continue;
				}

				for (Cliente cliente : clientes) {
					if (cliente.getId().equals(nif)) {
						System.out.println("El cliente ya existe");
						break;
					}
				}

				break;

			}
			while (true) {
				System.out.println("Ingrese el nombre del cliente: ");
				nombre = entrada.nextLine();
				if (!ValidarDatos.validarNombre(nombre)) {
					continue;
				}
				break;

			}
			while (true) {
				System.out.println("Ingrese la dirección del cliente: ");
				direccion = entrada.nextLine();
				if (!ValidarDatos.validarDireccion(direccion)) {
					continue;
				}
				break;
			}
			while (true) {
				System.out.println("Ingrese el teléfono del cliente: ");
				telefono = entrada.nextLine();
				if (!ValidarDatos.validarTelefono(telefono)) {
					continue;
				}
				break;

			}

			Cliente nuevoCliente = new Cliente(nif, nombre, direccion, telefono);
			clientes.add(nuevoCliente);

			System.out.println("Cliente agregado correctamente");
			break;

		}

	}

	public static void altaProducto(List<Producto> productos) {
		String codigo;
		String nombre;
		String descripcion;
		String precioPr;
		double precio;
		String unidadesPr;
		int unidades;
		String comoTomar;
		String efectosAdversos;
		int dosisUnidades;
		double descuento;
		while (true) {
			 	System.out.println("╔═══════════════════════════ ALTA DE PRODUCTO ═══════════════════════════╗");
			    System.out.println("║ Ingrese los siguientes datos para dar de alta un producto              ║");
			    System.out.println("║ Seleccione el tipo de producto:                                        ║");
			    System.out.println("║ 1. Medicamento                                                         ║");
			    System.out.println("║ 2. Producto de ParaFarmacia                                            ║");
			    System.out.println("╚════════════════════════════════════════════════════════════════════════╝");

			int opcion = entrada.nextInt();
			entrada.nextLine();

			if (opcion == 1) {
				while (true) {
					System.out.println("Ingrese el codigo del producto: ");
					codigo = entrada.nextLine();
					if (!ValidarDatos.validarCodigo(codigo)) {
						continue;
					}

					for (Producto producto : productos) {
						if (producto.getCodigo().equals(codigo)) {
							System.out.println("El producto ya existe");
							continue;
						}
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese el nombre del producto: ");
					nombre = entrada.nextLine();
					if (!ValidarDatos.validarNombreProducto(nombre)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese una descripción del producto: ");
					descripcion = entrada.nextLine();
					if (!ValidarDatos.validarDescripcion(descripcion)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese el precio del producto: ");
					precioPr = entrada.nextLine();
					precio = Double.parseDouble(precioPr);
					if (!ValidarDatos.validarPrecio(precio)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese las unidades disponibles del producto: ");
					unidadesPr = entrada.nextLine();
					unidades = Integer.parseInt(unidadesPr);
					if (!ValidarDatos.validarUnidades(unidades)) {
						continue;
					}
					break;

				}

				System.out.println("╔═════════════════════════ TIPO DE MEDICAMENTO ══════════════════════════╗");
			    System.out.println("║ Ingrese el tipo de medicamento:                                        ║");
			    System.out.println("║ 1. Analgésicos                                                         ║");
			    System.out.println("║ 2. Laxantes                                                            ║");
			    System.out.println("║ 3. Antiinfecciosos                                                     ║");
			    System.out.println("║ 4. Antidepresivos                                                      ║");
			    System.out.println("║ 5. Antitusivos                                                         ║");
			    System.out.println("║ 6. Mucolíticos                                                         ║");
			    System.out.println("║ 7. Antiácidos                                                          ║");
			    System.out.println("║ 8. Antiulcerosos                                                       ║");
			    System.out.println("║ 9. Antialérgicos                                                       ║");
			    System.out.println("║ 10. Antifiarreicos                                                     ║");
			    System.out.println("╚════════════════════════════════════════════════════════════════════════╝");

				int tipo = entrada.nextInt();
				entrada.nextLine();

				while (true) {
					System.out.println("Ingrese cómo tomar el medicamento: ");
					comoTomar = entrada.nextLine();
					if (!ValidarDatos.validarComoTomar(comoTomar)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese los efectos adversos del medicamento: ");
					efectosAdversos = entrada.nextLine();
					if (!ValidarDatos.validarEfectoAdversos(efectosAdversos)) {
						continue;
					}
					break;

				}

				Producto nuevoProducto = new Medicamento(codigo, nombre, descripcion, precio, unidades, false, tipo,
						comoTomar, efectosAdversos);
				productos.add(nuevoProducto);
				System.out.println("Producto agregado correctamente");
			} else if (opcion == 2) {

				while (true) {
					System.out.println("Ingrese el codigo del producto: ");
					codigo = entrada.nextLine();
					if (!ValidarDatos.validarCodigo(codigo)) {
						continue;
					}

					for (Producto producto : productos) {
						if (producto.getCodigo().equals(codigo)) {
							System.out.println("El producto ya existe");
							continue;
						}
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese el nombre del producto: ");
					nombre = entrada.nextLine();
					if (!ValidarDatos.validarNombreProducto(nombre)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese una descripción del producto: ");
					descripcion = entrada.nextLine();
					if (!ValidarDatos.validarDescripcion(descripcion)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese el precio del producto: ");
					precioPr = entrada.nextLine();
					precio = Double.parseDouble(precioPr);
					if (!ValidarDatos.validarPrecio(precio)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese las unidades disponibles del producto: ");
					unidadesPr = entrada.nextLine();
					unidades = Integer.parseInt(unidadesPr);
					if (!ValidarDatos.validarUnidades(unidades)) {
						continue;
					}
					break;

				}

				System.out.println("╔═══════════════════════════ CATEGORÍA DE PRODUCTO DE PARAFARMACIA ═══════════════════════════╗");
			    System.out.println("║ Ingrese la categoría del producto de parafarmacia:                                          ║");
			    System.out.println("║ 1. Dental                                                                                   ║");
			    System.out.println("║ 2. Facial                                                                                   ║");
			    System.out.println("║ 3. Geles                                                                                    ║");
			    System.out.println("║ 4. Corporal                                                                                 ║");
			    System.out.println("║ 5. Cabello                                                                                  ║");
			    System.out.println("║ 6. Antimosquitos                                                                            ║");
			    System.out.println("║ 7. Íntima                                                                                   ║");
			    System.out.println("║ 8. Nasal                                                                                    ║");
			    System.out.println("║ 9. Ocular                                                                                   ║");
			    System.out.println("║ 10. Botiquín                                                                                ║");
			    System.out.println("║ 11. Oídos                                                                                   ║");
			    System.out.println("║ 12. Toallitas                                                                               ║");
			    System.out.println("║ 13. Limpieza                                                                                ║");
			    System.out.println("║ 14. Hogar                                                                                   ║");
			    System.out.println("║ 15. Mascarillas                                                                             ║");
			    System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════╝");

				int categoria = entrada.nextInt();
				entrada.nextLine();

				while (true) {
					System.out.println("Ingrese la dosis por unidad del producto de parafarmacia: ");
					dosisUnidades = entrada.nextInt();
					if (!ValidarDatos.validarDosisUnidades(dosisUnidades)) {
						continue;
					}
					break;

				}
				while (true) {
					System.out.println("Ingrese el descuento del producto de parafarmacia: ");
					descuento = entrada.nextDouble();
					if (!ValidarDatos.validarDescuento(descuento)) {
						continue;
					}
					break;

				}

				Producto nuevoProducto = new ParaFarmacia(codigo, nombre, descripcion, precio, unidades, categoria,
						dosisUnidades, descuento);
				productos.add(nuevoProducto);

				System.out.println("Producto agregado correctamente");
			} else {
				System.out.println("Opción no valida");
			}
		}
	}

	public static void buscarClienteNif(List<Cliente> clientes) {
		System.out.println("Introduzca el nif del cliente que quiere buscar: ");
		String nif = entrada.nextLine();

		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(nif)) {
				if (!cliente.isBaja()) {
					System.out.println("Informacón del cliente buscado: ");
					System.out.println(cliente);
				} else {
					System.out.println("El cliente ha sido dado de baja");
				}
				return;
			}
		}
		System.out.println("Cliente no encontrado");

	}

	public static void buscarProductoCodigo(List<Producto> productos) {
		System.out.println("Introduzco el código del producto que quiere buscar: ");
		String codigo = entrada.nextLine();

		for (Producto producto : productos) {
			if (producto.getCodigo().equals(codigo)) {
				if (!producto.isBaja()) {
					System.out.println("Información del producto buscado: ");
					System.out.println(producto);
				} else {
					System.out.println("El producto ha sido dado de baja");
				}
				return;
			}
		}
		System.out.println("Producto no encontrado");

	}

	public static void bajaCliente(List<Cliente> clientes) {
		System.out.println("Ingrese el NIF del cliente que quiera dar de baja: ");
		String nif = entrada.nextLine();

		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(nif)) {
				cliente.setBaja(true);
				System.out.println("Cliente dado de baja correctamente");
				return;
			}
		}
		System.out.println("Cliente no encontrado");
	}

	public static void bajaProducto(List<Producto> productos) {
		System.out.println("Ingrese el codigo del producto que quiera dar de baja: ");
		String codigo = entrada.nextLine();

		for (Producto producto : productos) {
			if (producto.getCodigo().equals(codigo)) {
				producto.setBaja(true);
				System.out.println("Producto dado de baja correctamente");
				return;
			}
		}
		System.out.println("Producto no encontrados");
	}

	public static void modificarCliente(List<Cliente> clientes) {
		System.out.println("Ingrese el NIF del cliente que desea modificar: ");
		String nif = entrada.nextLine();

		Cliente clienteAModificar = null;
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(nif) && !cliente.isBaja()) {
				clienteAModificar = cliente;
				break;
			}
		}

		if (clienteAModificar == null) {
			System.out.println("Cliente no encontrado.");
			return;
		}

		int opcion;
		do {
			System.out.println("╔═════════════════════════════════════════════ MODIFICAR DATOS ══════════════════════════════════════════╗");
		    System.out.println("║ Seleccione el dato que desea modificar:                                                                ║");
		    System.out.println("║ 1. NIF                                                                                                 ║");
		    System.out.println("║ 2. Nombre                                                                                              ║");
		    System.out.println("║ 3. Dirección                                                                                           ║");
		    System.out.println("║ 4. Teléfono                                                                                            ║");
		    System.out.println("║ 5. Salir                                                                                               ║");
		    System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
			opcion = entrada.nextInt();
			entrada.nextLine();

			switch (opcion) {
			case 1:
				modificarNifCliente(clienteAModificar);
				break;
			case 2:
				modificarNombreCliente(clienteAModificar);
				break;
			case 3:
				modificarDireccionCliente(clienteAModificar);
				break;
			case 4:
				modificarTelefonoCliente(clienteAModificar);
				break;
			case 5:
				System.out.println("Saliendo del menú");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 5);
	}

	public static void modificarNifCliente(Cliente cliente) {
		System.out.println("Ingrese el nuevo NIF del cliente: ");
		String nuevoNif = entrada.nextLine();
		if (!ValidarDatos.validarNIF(nuevoNif)) {
			return;
		}
		cliente.setId(nuevoNif);
		System.out.println("NIF del cliente modificado correctamente");
	}

	public static void modificarNombreCliente(Cliente cliente) {
		System.out.println("Ingrese el nuevo nombre del cliente: ");
		String nuevoNombre = entrada.nextLine();
		if (!ValidarDatos.validarNombre(nuevoNombre)) {
			return;
		}
		cliente.setNombre(nuevoNombre);
		System.out.println("Nombre del cliente modificado correctamente");
	}

	public static void modificarDireccionCliente(Cliente cliente) {
		System.out.println("Ingrese la nueva dirección del cliente: ");
		String nuevaDireccion = entrada.nextLine();
		if (!ValidarDatos.validarDireccion(nuevaDireccion)) {
			return;
		}
		cliente.setDireccion(nuevaDireccion);
		System.out.println("Dirección del cliente modificada correctamente");
	}

	public static void modificarTelefonoCliente(Cliente cliente) {
		System.out.println("Ingrese el nuevo teléfono del cliente");
		String nuevoTelefono = entrada.nextLine();
		if (!ValidarDatos.validarTelefono(nuevoTelefono)) {
			return;
		}
		cliente.setTelefono(nuevoTelefono);
		System.out.println("Teléfono del cliente modificado correctamente");
	}

	public static void modificarProducto(List<Producto> productos) {
		 	System.out.println("╔═════════════════════════════════════════════ MODIFICAR TIPO DE PRODUCTO ═══════════════════════════════╗");
		    System.out.println("║ ¿Qué tipo de producto desea modificar?                                                                 ║");
		    System.out.println("║ 1. Medicamento                                                                                         ║");
		    System.out.println("║ 2. Producto de Parafarmacia                                                                            ║");
		    System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
		int opcionTipo = entrada.nextInt();
		entrada.nextLine();

		System.out.println("Ingrese el código del producto que desea modificar:");
		String codigo = entrada.nextLine();

		Producto productoAModificar = null;
		for (Producto producto : productos) {
			if (producto.getCodigo().equals(codigo) && !producto.isBaja()) {
				productoAModificar = producto;
				break;
			}
		}

		if (productoAModificar == null) {
			System.out.println("Producto no encontrado");
			return;
		}
		int opcion;
		do {
			System.out.println("╔═════════════════════════════════════════════ MODIFICAR DATOS ══════════════════════════════════════════╗");
		    System.out.println("║ ¿Qué desea modificar?                                                                                  ║");
		    System.out.println("║ 1. Código                                                                                              ║");
		    System.out.println("║ 2. Nombre                                                                                              ║");
		    System.out.println("║ 3. Descripción                                                                                         ║");
		    System.out.println("║ 4. Precio                                                                                              ║");
		    System.out.println("║ 5. Unidades                                                                                            ║");

		    if (opcionTipo == 1) {
		        System.out.println("║ 6. Cómo tomar                                                                                      	 ║");
		        System.out.println("║ 7. Efectos adversos                                                                                	 ║");
		    } else if (opcionTipo == 2) {
		        System.out.println("║ 6. Dosis por unidad                                                                                	 ║");
		        System.out.println("║ 7. Descuento                                                                                      	 ║");
		    }
		    System.out.println("║ 8. Salir                                                                                               ║");
		    System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
			opcion = entrada.nextInt();
			entrada.nextLine();

			switch (opcion) {
			case 1:
				modificarCodigoProducto(productoAModificar);
				break;
			case 2:
				modificarNombreProducto(productoAModificar);
				break;
			case 3:
				modificarDescripcionProducto(productoAModificar);
				break;
			case 4:
				modificarPrecioProducto(productoAModificar);
				break;
			case 5:
				modificarUnidadesProducto(productoAModificar);
				break;
			case 6:
				if (opcionTipo == 1) {
					modificarComoTomarMedicamento((Medicamento) productoAModificar);
				} else if (opcionTipo == 2) {
					modificarDosisUnidadesParafarmacia((ParaFarmacia) productoAModificar);
				}
				break;
			case 7:
				if (opcionTipo == 1) {
					modificarEfectosAdversosMedicamento((Medicamento) productoAModificar);
				} else if (opcionTipo == 2) {
					modificarDescuentoParafarmacia((ParaFarmacia) productoAModificar);
				}
				break;
			case 8:
				System.out.println("Saliendo del menú");
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 8);

		System.out.println("Producto modificado correctamente");

	}

	public static void modificarCodigoProducto(Producto producto) {
		System.out.println("Ingrese el nuevo código: ");
		String nuevoCodigo = entrada.nextLine();
		if (!ValidarDatos.validarCodigo(nuevoCodigo)) {
			return;
		}

		producto.setCodigo(nuevoCodigo);
		System.out.println("Código del producto modificado correctamente");

	}

	public static void modificarNombreProducto(Producto producto) {
		System.out.println("Ingrese el nuevo nombre ");
		String nuevoNombre = entrada.nextLine();
		if (!ValidarDatos.validarNombre(nuevoNombre)) {
			return;
		}

		producto.setNombre(nuevoNombre);
		System.out.println("Nombre del producto modificado correctamente");

	}

	public static void modificarDescripcionProducto(Producto producto) {
		System.out.println("Ingrese la nueva descripción: ");
		String nuevaDescripcion = entrada.nextLine();
		if (!ValidarDatos.validarDescripcion(nuevaDescripcion)) {
			return;
		}

		producto.setDescripcion(nuevaDescripcion);
		System.out.println("Descripción del producto modificada correctamente");

	}

	public static void modificarPrecioProducto(Producto producto) {
		System.out.println("Ingrese el nuevo precio: ");
		double nuevoPrecio = entrada.nextDouble();
		if (!ValidarDatos.validarPrecio(nuevoPrecio)) {
			return;
		}

		producto.setPrecio(nuevoPrecio);
		System.out.println("Precio del producto modificado correctamente");

	}

	public static void modificarUnidadesProducto(Producto producto) {
		System.out.println("Ingrese las nuevas unidades: ");
		int nuevasUnidades = entrada.nextInt();
		if (!ValidarDatos.validarUnidades(nuevasUnidades)) {
			return;
		}

		producto.setUnidades(nuevasUnidades);
		System.out.println("Unidades del producto modificadas correctamente");

	}

	public static void modificarComoTomarMedicamento(Medicamento medicamento) {
		System.out.println("Ingrese la nueva forma de cómo tomar el medicamento: ");
		String nuevoComoTomar = entrada.nextLine();
		if (!ValidarDatos.validarComoTomar(nuevoComoTomar)) {
			return;
		}

		medicamento.setComoTomar(nuevoComoTomar);
		System.out.println("Cómo tomar el medicamento modificado correctamente");

	}

	public static void modificarEfectosAdversosMedicamento(Medicamento medicamento) {
		System.out.println("Ingrese los nuevos efectos adveros: ");
		String nuevosEfectosAdversos = entrada.nextLine();
		if (!ValidarDatos.validarEfectoAdversos(nuevosEfectosAdversos)) {
			return;
		}

		medicamento.setEfectosAdversos(nuevosEfectosAdversos);
		System.out.println("Efectos adversos del medicamento modificados correctamente");

	}

	public static void modificarDosisUnidadesParafarmacia(ParaFarmacia parafarmacia) {
		System.out.println("Ingrese la nueva dosis por unidad: ");
		int nuevaDosisUnidades = entrada.nextInt();
		if (!ValidarDatos.validarDosisUnidades(nuevaDosisUnidades)) {
			return;
		}

		parafarmacia.setDosisUnidades(nuevaDosisUnidades);
		System.out.println("Dosis por unidad del producto de parafarmacia modificadas correctamente");

	}

	public static void modificarDescuentoParafarmacia(ParaFarmacia parafarmacia) {
		System.out.println("Ingrese el nuevo descuento: ");
		double nuevoDescuento = entrada.nextInt();
		if (!ValidarDatos.validarDescuento(nuevoDescuento)) {
			return;
		}

		parafarmacia.setDescuento(nuevoDescuento);
		System.out.println("Descuento del producto de parafarmacia modificadas correctamente");

	}

	public static void listarClientes(List<Cliente> clientes) {
		System.out.println("Listado de clientes: ");

		boolean clientesAlta = false;
		for (Cliente cliente : clientes) {
			if (!cliente.isBaja()) {
				System.out.println(cliente);
				clientesAlta = true;
			}
		}

		if (!clientesAlta) {
			System.out.println("No hay clientes registrados");
		}
	}

	public static void listarProductos(List<Producto> productos) {
		System.out.println("Listado de productos: ");

		boolean productosAlta = false;
		for (Producto producto : productos) {
			if (!producto.isBaja()) {
				System.out.println(producto);
				productosAlta = true;
			}
		}

		if (!productosAlta) {
			System.out.println("No hay productos registrados");
		}
	}

	public static void cargarDatos(List<Cliente> clientes, List<Producto> productos) {
		IO_ES io = new IO_ES(clientes, productos);
		io.leerDatos();

	}
}
