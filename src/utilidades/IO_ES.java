package utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import estructuraDatos.Cliente;
import estructuraDatos.Producto;

public class IO_ES {
	private List<Cliente> clientes;
	private List<Producto> productos;
	private String nombreArchivo = "datos.txt";
	private File archivoDatos = new File(nombreArchivo);

	public IO_ES(List<Cliente> clientes, List<Producto> productos) {
		this.clientes = clientes;
		this.productos = productos;
	}

	public void leerDatos() {
		if (archivoDatos.exists() && archivoDatos.isFile()) {
			try (ObjectInputStream lectorArchivo = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
				while (true) {
					try {
						Object objeto = lectorArchivo.readObject();
						if (objeto instanceof Cliente) {
							clientes.add((Cliente) objeto);
						} else if (objeto instanceof Producto) {
							productos.add((Producto) objeto);
						}
					} catch (Exception e) {
						break;
					}
				}
				System.out.println("La carga de datos se ha realizado correctamente");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Datos no cargados: no existe el archivo");
		}
	}

	public void escribirDatos() throws IOException {
		archivoDatos.setWritable(true);
		Files.deleteIfExists(Paths.get(nombreArchivo));
		ObjectOutputStream escrituraDatos = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
		for (Cliente cliente : clientes) {
			escrituraDatos.writeObject(cliente);
		}

		for (Producto producto : productos) {
			escrituraDatos.writeObject(producto);
		}
		escrituraDatos.close();
		archivoDatos.setWritable(false);

		System.out.println("Datos guardados correctamente");
	}

}
