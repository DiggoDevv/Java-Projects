package Bank;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//forma antiga de invocar o cliente sem a utilização de métodos
		//paulo.nome = "Paulo Silveira";
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
	
		System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
	//agora em duas linhas:
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
	
	}
}
