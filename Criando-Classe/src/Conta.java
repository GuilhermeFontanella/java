class Contas {
	double saldo = 0;
	int agencia = 0;
	int numeroDaConta = 0;
	String titular = " ";
	
	void deposita(double valor, Contas destino) {
		destino.saldo += valor;
	}
	void saque(double valor) {
		
		double valorSaque = valor;
		
		if(this.saldo <= 0.00 || this.saldo < valorSaque) {
			System.out.println("Saldo insuficiente");		
		} else if(this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("Valor sacado: R$" + valorSaque);
			System.out.println("Saldo disponível em conta: R$" + this.saldo);
		}
		
	}
	
	void transfere(Contas destino , double valor) {
		double valorTranferido = valor;
		this.saldo -= valorTranferido;
		destino.saldo += valorTranferido;
	}
}