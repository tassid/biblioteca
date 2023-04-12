package biblioteca.beans;

public class Exemplar {

	private Integer idExemplar;
	
	private Midia midia;

	public Exemplar(Integer idExemplar, Midia midia) {
		super();
		this.idExemplar = idExemplar;
		this.midia = midia;
	}
	
	@Override
	public String toString() {
		return " Exemplar [idExemplar=" + idExemplar + "]";
	}


	public Integer getIdExemplar() {
		return idExemplar;
	}

	public void setIdExemplar(Integer idExemplar) {
		this.idExemplar = idExemplar;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	
	
}
