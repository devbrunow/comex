package comex;

public class MainProduto {
	public static void main(String[] args) {
	
		Produto produto1 = new Produto(null, null, 0, 0, null);
		produto1.setId(1);
		produto1.setNome("Notebook Samsung");
		produto1.setDescricao("");
		produto1.setPrecoUnitario(3523.00);
		produto1.setQuantidadeEmEstoque(1);
		produto1.setCategoria("Informática");
		

	
		Produto produto2 = new Produto(null, null, 0, 0, null);
		produto2.setId(1);
		produto2.setNome("Clean Architecture");
		produto2.setDescricao("");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEmEstoque(2);
		produto2.setCategoria("Livros");
		
		
		Produto produto3 = new Produto(null, null, 0, 0, null);
		produto3.setId(1);
		produto3.setNome("Monitor Dell 27,");
		produto3.setDescricao("");
		produto3.setPrecoUnitario(1889.00);
		produto3.setQuantidadeEmEstoque(3);
		produto3.setCategoria("Informática");
		
		System.out.println(produto1.id + " " + produto1.nome + " " + produto1.descricao + " " + produto1.precoUnitario + " " +
				produto1.quantidadeEmEstoque + " "	+ produto1.categoria   + " " + produto1.calculaValorTotalEmEstoque(3523.00, 1 ));
		System.out.println(produto2.id + " " + produto1.nome + " " + produto1.descricao + " " + produto2.precoUnitario + " " +
				produto2.quantidadeEmEstoque + " "	+ produto2.categoria + " " + produto2.calculaValorTotalEmEstoque(102.90, 2   ));
		System.out.println(produto3.id + " " + produto3.nome + " " + produto3.descricao + " " + produto3.precoUnitario + " " +
				produto3.quantidadeEmEstoque + " "	+ produto3.categoria + " " + produto3.calculaValorTotalEmEstoque(1889.00, 3));
		System.out.println(produto3.id + " " + produto3.nome + " " + produto3.descricao + " " + produto3.precoUnitario + " " +
				produto3.quantidadeEmEstoque + " "	+ produto3.categoria + " " + produto3.calculaValorTotalEmEstoque(1889.00, 3));
		
		
	}
}