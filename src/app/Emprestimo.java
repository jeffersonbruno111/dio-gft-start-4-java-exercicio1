package app;

public class Emprestimo {
	
	OperacoesBasicas op = new OperacoesBasicas();

	public float valorEmprestimo(float valor, float meses) {
		return op.soma(valor, (op.multiplicacao(op.multiplicacao(op.divisao(valor, 100), 3), meses)));
	}
}
