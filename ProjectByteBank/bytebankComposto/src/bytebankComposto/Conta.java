package bytebankComposto;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	//Cliente titular = new Cliente(); quando abre a conta já abre um novo cliente
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
    }
	public boolean tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		}
	public double getSaldo() {
		return this.saldo;
	}
}

