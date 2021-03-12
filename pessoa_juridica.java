package atividadeFullStack;

public class pessoa_juridica extends Pessoa {
	private String cnpj;
	private String atividade;
	
	public pessoa_juridica(String nome, Integer id, String endereco, String cnpj, String atividade) {
		super(nome, id, endereco);
		this.cnpj = cnpj;
		this.atividade = atividade;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
	
}
