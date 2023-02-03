package livraria;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Livro2 {
	private String autor;
	private String assunto;
	@OneToOne
	private Editoras editora;
	@ManyToOne
	private ClientesDaLivraria clientes;
	private int quantidadeEstoque;
	
	private Date data;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ISBN;
	
	public Livro2() {
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Editoras getEditora() {
		return editora;
	}

	public void setEditora(Editoras editora) {
		this.editora = editora;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
}
