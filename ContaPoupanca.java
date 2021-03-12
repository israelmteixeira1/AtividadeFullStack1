package atividadeFullStack;

public class ContaPoupanca extends Conta{

	private double txCorrecao;
	
	ContaPoupanca(Pessoa cliente, int nrConta, double Saldo, double txCorrecao) {
		super(cliente, nrConta, Saldo);
		this.txCorrecao = txCorrecao;
	}

	public double getTxCorrecao() {
		return txCorrecao;
	}

	public void setTxCorrecao(double txCorrecao) {
		this.txCorrecao = txCorrecao;
	}
	
	public void atualizaSaldoRendimento() {
		double rendimento = super.getSaldo();
		rendimento= rendimento * (txCorrecao / 100);
		super.depositar(rendimento);
		System.out.println("Saldo atualizado!");
	}
}
