package biblioteca.beans;

import java.util.List;

public class Revista extends Midia{

	private String periodicidade;

	public Revista(Integer idMidia, String titulo, List<Exemplar> exemplares, String periodicidade) {
		super(idMidia, titulo, exemplares);
		this.periodicidade = periodicidade;
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}


}
