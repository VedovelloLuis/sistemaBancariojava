package sisBancario;

public abstract class Conta {
	

	private double numAgencia;
	private int numConta;
	private int tipoConta;
	private String titular;
	private double saldo;
	protected static int qtdContas;

    public Conta(int agencia, int numero, String titular) {
        Conta.qtdContas++;        
        this.numAgencia = agencia;
        this.numConta = numero;
        this.titular = titular;
        System.out.println("Conta " + this.numConta + " criada com sucesso.");
        
        
    }
		
		

public void depositar(double valor) {
	System.out.println("--------Depósito de R$" + valor + " feito na conta "+ this.numConta +"--------");
	this.saldo += valor;
}
public void sacar(double valor) {
	System.out.println("--------Saque inicializado na conta "+ this.numConta +"--------");
    System.out.println("Saldo Antigo da Conta " +this.numConta +": R$"+this.saldo+".");
	 if (this.saldo >= valor) {
         this.saldo -= valor;
         System.out.println("Novo Saldo da Conta " +this.numConta +": R$"+this.saldo+".");
         System.out.println("Saque de R$" +valor +" feito com sucesso.");
     	System.out.println("--------Saque finalizado na conta "+ this.numConta +"--------");
     } else {
         System.out.println("Impossível sacar R$" +valor +", fundos insuficientes.");
     	System.out.println("--------Saque inicializado na conta "+ this.numConta +"--------");
     }
}

public void transferir(Conta destino, double valor) {
    System.out.println("--------Transferência de R$ " + valor +" inicializada--------");
    System.out.println("Saldo Antigo da Conta " +this.numConta +": R$"+this.saldo+".");
    System.out.println("Saldo Antigo da Conta " +destino.numConta +": R$"+destino.saldo+".");
    this.saldo = this.saldo - valor;
    destino.saldo = destino.saldo + valor;
	System.out.println("Transferência feita com sucesso.");
    System.out.println("Novo Saldo da Conta " +this.numConta +": R$"+this.saldo+".");
    System.out.println("Novo Saldo da Conta " +destino.numConta +": R$"+destino.saldo +".");
}
public void consultar() {
	System.out.println("--------Consulta inicializada--------");
	System.out.println("Número da Conta:" +this.numConta);
	System.out.println("Número da Agência:" +this.numAgencia);
	System.out.println("Saldo disponível da Conta: R$" +this.saldo);
	System.out.println("Titular da Conta:" +this.titular);
	getTipoConta();

}


public double getNumAgencia() {
	return numAgencia;
}

public void setNumAgencia(double numAgencia) {
	this.numAgencia = numAgencia;
}

public int getNumConta() {
	return numConta;
}

public void setNumConta(int numConta) {
	this.numConta = numConta;
}

public void getTipoConta() {
	System.out.println(tipoConta);
}

public void setTipoConta(int tipoConta) {
	this.tipoConta = tipoConta;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

}