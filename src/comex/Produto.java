package comex;

public class Produto {
		protected int id;
		protected String nome;
		protected String descricao;
		protected double precoUnitario;
		int quantidadeEmEstoque;
		protected String categoria;
		
		
		
		public Produto(String nome2, String descricao2, double precoUnitario2, int quantidadeEstoque, Categoria categoria2) {
			// TODO Auto-generated constructor stub
		}







		public double calculaValorTotalEmEstoque(double preco, double quantidade ) {
			preco = precoUnitario;
			quantidade = quantidadeEmEstoque;
			double valor;
			
			
			valor = preco * quantidade;
			
			
		return valor;
		
					
		}
		
		
		
		
		
		
		
		public int getId() {
			return id;
		}		
		public String getNome() {
			return nome;
		}
		
		
	public String getDescriao() {
		return descricao;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	
	public String getCategoria() {
		return categoria;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
