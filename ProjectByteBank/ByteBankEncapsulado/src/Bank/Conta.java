package Bank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//Cliente titular = new Cliente(); quando abre a conta já abre um novo cliente
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
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
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
			}
		this.numero = numero;
	}
	public int getAgencia() {
		
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
		if(agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public int getTotal() {
		return Conta.total;
	}
	
}
