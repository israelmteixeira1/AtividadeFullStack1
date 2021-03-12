package atividadeFullStack;

import java.util.Calendar;

public class pessoafisica extends Pessoa{
	private String cpf;
	private Integer idade;
	private String Genero;
	
	
	public pessoafisica(String nome, Integer id, String endereco, String cpf, Integer idade, String genero) {
		super(nome, id, endereco);
		this.cpf = cpf;
		this.idade = idade;
		this.Genero = genero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer idade() {
		return idade;
	}
	public void setIdade(Calendar dtNascimento) {
		this.idade = idade;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	
}
