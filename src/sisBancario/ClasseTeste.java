package sisBancario;

public class ClasseTeste {
	
	
	public static void main(String[] args) {
		System.out.println("Bem-Vindo ao Sistema Banc�rio.");
		ContaCorrente cc = new ContaCorrente(200, 102, "Kaue"); //Conta 102 ag�ncia 200
        cc.depositar(870.0);

        ContaPoupanca cp = new ContaPoupanca(201,100, "Luis"); //Conta 100 Ag�ncia 201
        cp.depositar(1470.0);
        
        ContaPoupanca cp2 = new ContaPoupanca(202, 101, "Cleber"); // Conta 101 Ag�ncia 202
        cp2.depositar(8599.0);
        
        cp.transferir(cp2, 150.0);




    System.out.println("N�mero de Contas: " + Conta.qtdContas);
    
    cp2.consultar();
    cc.consultar();
    cp2.sacar(4500.50);

		
    System.out.println("Tudo foi executado com sucesso.");
   // System.out.println("Feito por Luis e Kaue.");
   // System.out.println("FATEC ANTONIO RUSSO.");
	}



}
