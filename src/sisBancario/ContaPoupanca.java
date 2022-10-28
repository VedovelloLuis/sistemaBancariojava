package sisBancario;

public class ContaPoupanca extends Conta{

public ContaPoupanca(int agencia, int numero, String titular) {
	super(agencia, numero, titular);

	}

@Override
public void getTipoConta() {
	System.out.println("--------Tipo de Conta: Poupança--------");


}



}
