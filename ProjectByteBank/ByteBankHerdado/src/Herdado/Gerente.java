package Herdado;

    // classe gerente herdou classe funcionario
	// recebendo todos os comportamentos da classe funcionario
	// criamos um relacionamento entre essas classes

	//funcionario  é a classe mae, (base class, Super class)
	//gerente é a classe filho
public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentifica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
		// super = super deixa claro que o método está definido na classe mãe
	}
	
	
}
