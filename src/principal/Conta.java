package principal;

public abstract class Conta implements iConta {
//	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	private int numero;
	protected Double saldo;
	
	

	@Override
	public void sacar(double valor) {
	}

	@Override
	public void depositar(double valor) {
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;

	}

}
