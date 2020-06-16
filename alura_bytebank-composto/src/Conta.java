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
	
	
	
	// m�todo 'deposita', atributo 'valor' a ser depositado
	
	public void deposita (double valor) {
		
		this.saldo  += valor;
		
		System.out.println("Dep�sito de " + valor + " conclu�do");
		//System.out.println("Seu saldo agora �: " + this.saldo);
	
	}
	
	public boolean saca(double valor) { 
        
		if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " conclu�do");
            //System.out.println("Seu saldo agora �: " + this.saldo);
            return true;
        } else { 
        	System.out.println("N�o � poss�vel sacar mais que " + this.saldo);
            return false;
        }
    }
	
	
	public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor;
            //destino.saca(valor);
            destino.saldo += valor;
            //destino.deposita(valor);
            System.out.println("Transfer�ncia  de " + valor + " conclu�do");
            return true;
        } else {
        	System.out.println("N�o � poss�vel transferir mais que " + this.saldo);
        	return false;
        }
	
	}



	

}
