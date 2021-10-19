package br.com.carlo.church.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String titulo;
	private String isbn;
	private double preco;
	private String dataLancamento;
	
	@ManyToMany
	private List<Filme> filmes = new ArrayList<Filme>();
	
	public List<Filme> getFilmes() {
		return filmes;
	}
	
	public void adicionaFilme(Filme filme) {
		this.filmes.add(filme);
	}
	
	public Filme() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

}
