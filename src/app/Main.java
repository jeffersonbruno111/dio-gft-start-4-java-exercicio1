package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacoesBasicas op = new OperacoesBasicas();
		Mensagem mns = new Mensagem();
		Emprestimo emp = new Emprestimo();
		
		System.out.println("Calculando as 4 opera��es b�sicas com os n�meros 10 e 25: ");
		System.out.println("Soma: " + op.soma(10, 25));
		System.out.println("Subtra��o: "+ op.subtracao(10,25));
		System.out.println("Multiplica��o: "+ op.multiplicacao(10,25));
		System.out.println("Divis�o: "+ op.divisao(10,25));
				
		System.out.println("\n"+mns.mensagem());
		
		System.out.println("\nEmprestimo de 1.000,00 com juros de 3% a.m.: R$ "+emp.valorEmprestimo(1000, 2));

	}

}
