package estructuraDatos;

public class Medicamento extends Producto{
	static final long serialVersionUID = 1935696281283953314L;
	private String comoTomar;
	private String efectosAdversos;
	private TipoMedicamento tm;
	int tipo;
	
	//Constructor
	public Medicamento (String codigo, String nombre, String descripcion, double precio, int unidades, boolean baja, int tipo, String comoTomar, String efectosAdversos) {
		super (codigo, nombre, descripcion, precio, unidades);
		this.comoTomar= comoTomar;
		this.efectosAdversos= efectosAdversos;
		switch(tipo) {
		case 1:
			this.tm = TipoMedicamento.ANALGESICOS;
			break;
		case 2:
			this.tm = TipoMedicamento.LAXANTES;
			break;
		case 3:
			this.tm = TipoMedicamento.ANTINFECCIOSOS;
			break;
		case 4:
			this.tm = TipoMedicamento.ANTIDEPRESIVOS;
			break;
		case 5:
			this.tm = TipoMedicamento.ANTITUSIVOS;
			break;
		case 6:
			this.tm = TipoMedicamento.MUCOLITICOS;
			break;
		case 7:
			this.tm = TipoMedicamento.ANTIACIDOS;
			break;
		case 8:
			this.tm = TipoMedicamento.ANTIULCEROSOS;
			break;
		case 9:
			this.tm = TipoMedicamento.ANTIALERGICOS;
			break;
		case 10:
			this.tm = TipoMedicamento.ANTIFIARREICOS;
			break;
			
		}
	}
	
	public Medicamento (Medicamento c) {
		super(c);
		this.comoTomar = c.comoTomar;
		this.efectosAdversos = c.efectosAdversos;
		this.tipo = c.tipo;
	}

	//Getters y Setters
	public String getComoTomar() {
		return comoTomar;
	}

	public void setComoTomar(String comoTomar) {
		this.comoTomar = comoTomar;
	}

	public String getEfectosAdversos() {
		return efectosAdversos;
	}

	public void setEfectosAdversos(String efectosAdversos) {
		this.efectosAdversos = efectosAdversos;
	}

	public TipoMedicamento getTm() {
		return tm;
	}

	public void setTm(TipoMedicamento tm) {
		this.tm = tm;
	}
	
	public String toString() {
		return super.toString() +
				" como tomar='" + comoTomar + '\'' +
				", efectos adversos='" + efectosAdversos + '\'' +
				", tipo medicamento=" + tm +
				'}';
	}
	
	

}
