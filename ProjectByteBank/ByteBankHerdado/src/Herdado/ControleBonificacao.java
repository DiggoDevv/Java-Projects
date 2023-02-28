package Herdado;

public class ControleBonificacao {
	
	private double soma;
	                //referencia do tipo funcionario
	//Ele entra no método getBonificacao e verifica
	//qual bonificacao especifica que vai ser chamada
	//se é a bonificacao de um gerente ou de um funcionario por exemplo
	//sem repetir código, essa é a caracteristica do polimorfismo
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
	
}
