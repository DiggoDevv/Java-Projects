package Herdado;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Funcionario Ronaldinho = new Funcionario();
		Ronaldinho.setNome("Ronaldinho");
		Ronaldinho.setCpf("128321321");
		Ronaldinho.setSalario(2560.00);
		
		System.out.println(Ronaldinho.getNome());
		System.out.println(Ronaldinho.getBonificacao());
	}
}
