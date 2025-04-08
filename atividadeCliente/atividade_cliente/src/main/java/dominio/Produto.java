package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "nomes")
	private String nome;

	private double preco;
	
	@ManyToMany(mappedBy = "produtos")
	private List<Venda> vendas = new ArrayList<Venda>();
	
	public Produto() {
		this("",0);
	}
	
	public Produto(String nome, double preco) {
		setNome(nome);
		setPreco(preco);
	}

	public Long getId() {
		return this.Id;
	}

	public void setId(Long Id) {
		this.Id = Id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVenda(List<Venda> vendas) {
		this.vendas = vendas;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preco + "]";
	}
	
}
