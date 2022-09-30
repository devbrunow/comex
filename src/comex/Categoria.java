package comex;

public class Categoria {
	int id;
	String nome;
	String status = "ativa";
	
	//get buscador
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
