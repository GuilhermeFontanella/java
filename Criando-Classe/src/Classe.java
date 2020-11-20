
public class Classe {
	public static void main(String[] args) {
		Contas primeiraConta = new Contas();
		primeiraConta.agencia = 104;
		primeiraConta.numeroDaConta = 138463;
		primeiraConta.titular = "Fulano de tal";
		
		System.out.println("Saldo em conta: R$" + primeiraConta.saldo);
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Conta" + primeiraConta.numeroDaConta);
		System.out.println("Titular: " + primeiraConta.titular);
		
		System.out.println();
		
		Contas segundaConta = new Contas();
		segundaConta.agencia = 001;
		segundaConta.numeroDaConta = 1836346;
		segundaConta.titular = "Beltrano da Silva";		
		System.out.println("Saldo em conta: R$" + segundaConta.saldo);
		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("Conta: " + segundaConta.numeroDaConta);
		System.out.println("Titular: " + segundaConta.titular);
		
		System.out.println();
		
		/*
		segundaConta.transfere(primeiraConta, 0);
		System.out.println("Transferencia realizada com sucesso! Saldo atual: R$ " +  segundaConta.saldo);
		System.out.println("Saldo atual da sua conta: R$" + primeiraConta.saldo);
		
		primeiraConta.transfere(segundaConta, 0);
		System.out.println("Transferencia realizada com sucesso! Saldo atual: R$ " +  primeiraConta.saldo);
		System.out.println("Saldo atual da sua conta: R$" + segundaConta.saldo);
		
		primeiraConta.deposita(0, segundaConta);
		
		*/
		
		System.out.println();
		System.out.println();
		System.out.println("Realizando um deposito...");
		
		primeiraConta.deposita(0.00 , primeiraConta);
		System.out.println("Titular: " + primeiraConta.titular + " saldo atual: R$" + primeiraConta.saldo);
		
		System.out.println();
		System.out.println();
		System.out.println("Realizando um deposito...");
		
		segundaConta.deposita(500.0, segundaConta);
		System.out.println("Titular: " + segundaConta.titular + " saldo atual: R$" + segundaConta.saldo);
		
		System.out.println();
		System.out.println();
		System.out.println("Realizando uma saque...");
		
		System.out.println("Saldo atual: R$" + segundaConta.saldo);
		segundaConta.saque(800.00);
		
		
	}
	
}
