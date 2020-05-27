package modelo.base;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "numero", nullable = false)
	private int numero;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Endereco endereco;
	
	
	public Usuario() {
		
		
	}

	public Usuario(String nome, int numero, Endereco endereco) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
}
