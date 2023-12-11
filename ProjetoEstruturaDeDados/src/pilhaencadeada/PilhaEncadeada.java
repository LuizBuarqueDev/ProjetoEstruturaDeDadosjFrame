package pilhaencadeada;

public class PilhaEncadeada {

	private No topo;
	private int tamanho;
	private No noTemp;

	public PilhaEncadeada() {
		super();
		this.tamanho = 0;
		this.noTemp = null;
		this.topo = null;
	}

	public void push(String dado) {
		No novoNo = new No(dado);
		if (topo == null) {
			topo = novoNo;
			
		} else {
			novoNo.setPrev(topo);
			topo = novoNo;
		}
		
		tamanho++;
	}

	public String pop() {
		String elemento = topo.getDado();
		topo = topo.getPrev();
		tamanho--;
		return elemento;

	}

	public int size() {
		return tamanho;
	}

	public String top() {
		return topo.getDado();
	}

	public boolean isEmpty() {
		return tamanho == 0;

	}

//	public void print() {
//		noTemp = topo;
//		while (noTemp != null) {
//			System.out.print(noTemp.getDado() + " ; ");
//			noTemp = noTemp.getPrev();
//		}
//		System.out.println();
//	}
	public void print() {
		No[] pilhaVetor = new No[tamanho];
		noTemp = topo;

		// Adiciona os elementos da pilha em um array
		for (int i = 0; i < tamanho; i++) {
			pilhaVetor[i] = noTemp;
			noTemp = noTemp.getPrev();
		}

		// Imprime os elementos na ordem inversa
		for (int i = tamanho - 1; i >= 0; i--) {
			System.out.print(pilhaVetor[i].getDado() + " ; ");
		}
		
		System.out.println();
	}
}
