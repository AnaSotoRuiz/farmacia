package estructuraDatos;

public class ParaFarmacia extends Producto {
	static final long serialVersionUID = -3803775344008486447L;
	private int dosisUnidades;
	private double descuento;
	private Categoria cate;
	int categoria;
	
	//constructor
	public ParaFarmacia(String codigo, String nombre, String descripcion, double precio,
			int unidades, int categoria, int dosisUnidades, double descuento) {
		super(codigo, nombre, descripcion, precio, unidades);
		this.dosisUnidades = dosisUnidades;
		this.descuento = descuento;
		switch(categoria) {
			case 1:
				this.cate = Categoria.DENTAL;
				break;
			case 2:
				this.cate = Categoria.FACIAL;
				break;
			case 3:
				this.cate = Categoria.GELES;
				break;
			case 4:
				this.cate = Categoria.CORPORAL;
				break;
			case 5:
				this.cate = Categoria.CABELLO;
				break;
			case 6:
				this.cate = Categoria.ANTIMOSQUITOS;
				break;
			case 7:
				this.cate = Categoria.INTIMA;
				break;
			case 8:
				this.cate = Categoria.NASAL;
				break;
			case 9:
				this.cate = Categoria.OCULAR;
				break;
			case 10:
				this.cate = Categoria.BOTIQUIN;
				break;
			case 11:
				this.cate = Categoria.OIDOS;
				break;
			case 12:
				this.cate = Categoria.TOALLITAS;
				break;
			case 13:
				this.cate = Categoria.LIMPIEZA;
				break;
			case 14:
				this.cate = Categoria.HOGAR;
				break;
			case 15:
				this.cate = Categoria.MASCARILLAS;
				break;
		}
	}
	
	public ParaFarmacia (ParaFarmacia c) {
		super(c);
		dosisUnidades = c.dosisUnidades;
		descuento = c.descuento;
		categoria = c.categoria;
	}

	public int getDosisUnidades() {
		return dosisUnidades;
	}

	public void setDosisUnidades(int dosisUnidades) {
		this.dosisUnidades = dosisUnidades;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		return super.toString() + 
				" dosis unidades:'" + dosisUnidades + '\'' +
				", descuento='" + descuento + '\'' +
				", categoria=" + cate +
				'}';
	}


}
