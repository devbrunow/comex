package comex;

public class Produto {
		int id;
		String nome;
		String descricao;
		double precoUnitario;
		int quantidadeEmEstoque;
		String categoria;
		
		
		
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
