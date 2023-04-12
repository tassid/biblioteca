package biblioteca.beans;

import java.util.List;

public class Livro extends Midia{

	private String issn;

	public Livro(Integer idMidia, String titulo, List<Exemplar> exemplares, String issn) {
		super(idMidia, titulo, exemplares);
		this.issn = issn;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

}
