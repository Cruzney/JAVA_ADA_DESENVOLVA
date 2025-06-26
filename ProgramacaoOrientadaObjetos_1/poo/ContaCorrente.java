// O código no template tem um problema de implementação que permite que qualquer desenvolvedor consiga realizar alterações nos atributos sem seguir a regra de negócio implementada no setter da classe.

// Faça a correção do código para que todos os acessos aos atributos da classe sejam feitos, exclusivamente, através dos getters e setters.


class ContaCorrente { 
	private String agencia; 
	private int conta; 
	private double saldo; 

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() { 
		return this.saldo; 
	} 

	public String setSaldo(double valor) { 
		if(valor >= 0) { 
			this.saldo = valor; 
			return "Saldo atualizado"; 
		} 
		else { 
			return "Saldo insuficiente"; 
		} 
	} 
}