package dominio;

public class Venda {
	private Long Id;
	private double valorTotal;
	private List<Produto> produtos;
	//public Cliente;

	public Venda(){
	this();
	}

	public Venda(double valorTotal){
		setValorTotal(valorTotal);
	}

	public void setId(Long Id){
		this.Id = Id;
	}

	public Long getId(){
		return this.Id;
	}

	public void setValorTotal(double valorTotal){
		this.valorTotal = valorTotal;
	}

	public double getVelorTotal(){
		return this.valorTotal;
	}

	public void setProdutos(List<Produto> produtos){
		this.produtos = produtos;
	}

	public List<Produto> getProdutos(){
		return this.produtos;
	}

	@Override
	public String toString(){
		return "Venda[id=" + id + ", valor total=" + valorTotal + "]";
	}
}