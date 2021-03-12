package atividadeFullStack;

public class Conta {
	private Pessoa cliente;
	private Integer nrConta;
	private Double Saldo;
	
	public Pessoa getCliente() {
		return cliente;
	}
	public Integer getNrConta() {
		return nrConta;
	}
	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}
	public Double getSaldo() {
		return Saldo;
	}
	protected boolean TemSaldo(double valor) {
		if(this.Saldo >= valor)
		return true;
		else
			return false;
	}
	
	Conta(Pessoa cliente, int nrConta, Double Saldo) {
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.Saldo = Saldo;
		
	}
	
	private void debitar(double valor) {
		this.Saldo-= valor;
	}
	
	public void sacar(Double valor) {
		if(TemSaldo(valor) == true) {
			debitar(valor);
			System.out.println("o Saque será realizado!");
		}
		else
			System.out.println("Não há saldo suficiente na conta!");
	}
	
	public void depositar(Double valor) {
		this.Saldo+= valor;
	}
	
	public void transferir(double valorTransferencia, Conta contaDestino) {
		if(this.TemSaldo(valorTransferencia) == true) {
			this.sacar(valorTransferencia);
			contaDestino.depositar(valorTransferencia);
			System.out.println("Transferência realizada com sucesso!");
		}
		else {
			System.out.println("Não há saldo suficiente para realizar a transferência bacária.\nSaldo atual: R$ "+this.getSaldo());
		}
	}
}
