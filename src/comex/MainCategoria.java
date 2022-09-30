package comex;

public class MainCategoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		categoria1.setNome("INFORMATICA");
		categoria1.setStatus("ATIVA");
		
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		categoria2.setNome("MOVEIS");
		categoria2.setStatus("INATIVA");
		
		Categoria categoria3 = new Categoria();
		categoria3.setId(3);
		categoria3.setNome("LIVROS");
		categoria3.setStatus("ATIVA");
		
	System.out.println(categoria1.id + " " + categoria1.nome + " " + categoria1.status  );
	System.out.println(categoria2.id + " " + categoria2.nome + " " + categoria2.status  );
	System.out.println(categoria3.id + " " + categoria3.nome + " " + categoria3.status  );
	}	
}
