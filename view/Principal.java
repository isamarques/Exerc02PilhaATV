package view;
import br.com.leandrocolevati.pilhaint.Pilha;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		Pilha pilha = new Pilha();
		OperacaoController operaCont = new OperacaoController();
		
		for (int i = 0; i <=15; i++) {
			int valor = (int)((Math.random() * 51) + 1);
			System.out.print(valor+" ");
			pilha.push(valor);
		}
		
		System.out.println("");
		pilha = operaCont.maiorValor(pilha);
		
		System.out.print("o maior valor eh " + pilha.top());
	}

}
