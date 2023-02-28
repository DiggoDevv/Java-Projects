package Conta;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		// Conta = classe conta = variavel
		// o da esquerda precisa sempre ser o nome da classe
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		if(conseguiuRetirar) {
		System.out.println("Saque bem sucedido");
		}else {
		 System.out.println("saldo insuficiente para saque");
		}

	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	if(contaDaMarcela.tranfere(300, conta)) {
		System.out.println("tranferencia realizada");
	} else {
		System.out.println("saldo insuficiente");
	}
	System.out.println(contaDaMarcela.saldo);
	System.out.println(conta.saldo);
	
	conta.titular = "paulo silveira";
	System.out.println(conta.titular);
	
	
	}
	
}

//Como o método está sendo invocado pela contaDoPaulo, o saldo é referente a esta conta.
//Não incluímos a palavra-chave this junto à variável valor, pois ela não é um atributo de um objeto.
//Criamos, assim, nosso primeiro método. Escrevemos deposita(),
//parâmetros e qual será a devolução gerada pelo método.
//Usamos o this dentro de um método para acessar um atributo:
