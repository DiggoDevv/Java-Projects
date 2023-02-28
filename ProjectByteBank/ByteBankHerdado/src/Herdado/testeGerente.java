package Herdado;

public class testeGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("93213421");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autentifica = g1.autentifica(2222);
		
		System.out.println(autentifica);
		
		System.out.println(g1.getBonificacao());
	}
}
