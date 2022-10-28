package sisBancario;

public class ContaCorrente extends Conta {
	

	public ContaCorrente(int agencia, int numero, String titular) {
		super(agencia, numero, titular);


	}
	

	@Override
	public void getTipoConta() {
		System.out.println("--------Tipo de Conta: Corrente--------");


	}




}
