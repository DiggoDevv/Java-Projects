package Conta;

public class Criaconta {
	public static void main(String[] args) {
	Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);	
		
		primeiraConta.saldo  += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo= 50;  
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
//cada conta tem seu valor e não tem relação entre elas, pois são instancias diferentes.
//A instancia tem relação somente com o objeto, por isso é "orientado ao objeto"	
	}	
}
