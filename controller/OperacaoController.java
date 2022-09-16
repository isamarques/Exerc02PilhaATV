package controller;

//cada pop em uma variavel (2 variaveis)

import br.com.leandrocolevati.pilhaint.Pilha;

public class OperacaoController {

	public OperacaoController() {

	}

	public Pilha maiorValor (Pilha pilha) throws Exception {
		Pilha pilha2 = pilha; //duplica pilha
		int tamanho = pilha.size();
		
		while (tamanho > 1) {
			int aux1 = pilha.pop();
			int aux2 = pilha.pop();
			
			if (aux1 > aux2) {
				pilha.push(aux1);
			}
			else {
				pilha.push(aux2);
			}
			tamanho = pilha.size();
		}
		
		System.out.println("========================");
		System.out.println(pilha);
		
		return pilha;
	}
}
