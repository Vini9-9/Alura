class Conta {
	
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//Getters e Setters
	
	
	public double getSaldo() { 
        return this.saldo;
	}
	

	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Cliente getTitular() {
		return titular;
	}



	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
	// método 'deposita', atributo 'valor' a ser depositado
	
	public void deposita (double valor) {
		
		this.saldo  += valor;
		
		System.out.println("Depósito de " + valor + " concluído");
		//System.out.println("Seu saldo agora é: " + this.saldo);
	
	}
	
	public boolean saca(double valor) { 
        
		if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " concluído");
            //System.out.println("Seu saldo agora é: " + this.saldo);
            return true;
        } else { 
        	System.out.println("Não é possível sacar mais que " + this.saldo);
            return false;
        }
    }
	
	
	public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor;
            //destino.saca(valor);
            destino.saldo += valor;
            //destino.deposita(valor);
            System.out.println("Transferência  de " + valor + " concluído");
            return true;
        } else {
        	System.out.println("Não é possível transferir mais que " + this.saldo);
        	return false;
        }
	
	}



	

}
