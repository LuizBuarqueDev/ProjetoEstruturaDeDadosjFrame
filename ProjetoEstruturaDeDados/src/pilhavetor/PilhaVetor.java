package pilhavetor;

public class PilhaVetor {

	private String vetor[];
	private int tamanho;

	public PilhaVetor() {
		super();
		this.tamanho = 0;
		this.vetor = new String[10];
	}

	// Metodos auxiliareis

	private void tornarMaior() {
		if (tamanho == vetor.length) {
			String[] vetorTemp = new String[vetor.length + 10];
			for (int i = 0; i < tamanho; i++) {
				vetorTemp[i] = vetor[i];
			}
			
			vetor = vetorTemp;
		}
	}

	private void tornarMenor() {
		if (tamanho < vetor.length - 10) {
			int j = 0;
			String[] vetorTemp = new String[vetor.length - 10];
			for (int i = 0; i < tamanho; i++) {
				if (vetor[i] != null) {
					vetorTemp[j] = vetor[i];
					j++;
				}
				
			}
			
			vetor = vetorTemp;
		}
	}

	// Metodos principais

	public void push(String entrada) {
		tornarMaior();
		vetor[tamanho++] = entrada;
	}

	public String pop() {
		String elemeto = top();
		tornarMenor();
		vetor[--tamanho] = null;
		return elemeto;
	}

	public int size() {
		return tamanho;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	public String top() {
		return vetor[tamanho - 1];
	}

	public void print() {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetor[i] + "; ");
		}
		
		System.out.println();
	}
}
