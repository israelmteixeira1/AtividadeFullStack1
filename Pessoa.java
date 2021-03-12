package atividadeFullStack;

public class Pessoa {
	private String nome;
	private Integer id;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Pessoa(String nome, Integer id, String endereco) {
		super();
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
	}
	

}
