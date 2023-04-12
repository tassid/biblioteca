package biblioteca.beans;

import java.util.ArrayList;
import java.util.List;

public abstract class Midia {

	private Integer idMidia;
	
	private String titulo;
	
	private List<Exemplar> exemplares;
	
	@Override
	public String toString() {
		String midias =  "Midia [idMidia=" + idMidia + ", titulo=" + titulo + " Exemplares: {";
		
		for(Exemplar ex : exemplares) {
			midias += ex.toString();
		}

		midias += "}]";
		
		return midias;
	}

	public Midia(Integer idMidia, String titulo, List<Exemplar> exemplares) {
		this.idMidia = idMidia;
		this.titulo = titulo;
		this.exemplares = exemplares;
	}

	public Integer getIdMidia() {
		return idMidia;
	}

	public void setIdMidia(Integer idMidia) {
		this.idMidia = idMidia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void addExemplar(Exemplar ex) {
		exemplares.add(ex);
	}
	
	public void addExemplares(ArrayList<Exemplar> exs) {
		
		if(exs != null) {
			exemplares.addAll(exs);
		}
	}
	
}
