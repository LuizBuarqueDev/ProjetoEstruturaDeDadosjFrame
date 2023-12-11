package filavetor;

public class FilaVetor {

	private String vetor[];
	private int tamanho;
	private int f;
	private int r;

	public FilaVetor() {
		super();
		this.vetor = new String[10];
		this.tamanho = 0;
		this.f = 0;
		this.r = 0;
	}

	// Metodos auxiliareis

	private void tornarMaior() {
		if (tamanho == vetor.length || vetor[r] != null) {
			String[] vetorTemp = new String[vetor.length + 10];
			for (int i = 0; i < tamanho; i++) {
				vetorTemp[i] = vetor[(f + i) % vetor.length];
			}
			vetor = vetorTemp;
			f = 0; // proximo elemento
			r = tamanho; // proximo lugar vazio
		}
	}

	private void tornarMenor() {
		if (tamanho < vetor.length - 10) {
			String[] vetorTemp = new String[vetor.length - 10];
			for (int i = 0; i < tamanho; i++) {
				vetorTemp[i] = vetor[(f + i) % vetor.length];
			}
			vetor = vetorTemp;
			f = 0; // proximo elemento
			r = tamanho; // proximo lugar vazio
		}
	}

	public void enqueue(String dado) {
		tornarMaior();
		vetor[r] = dado;
		r = (r + 1) % vetor.length;
		tamanho++;
	}

	public String dequeue() {
		if (isEmpty()) {
			throw new NullPointerException("A fila esta vazia");
		}
		
		tornarMenor();
		String elemento = vetor[f];
		vetor[f] = null;
		f = (f + 1) % vetor.length;
		tamanho--;
		return elemento;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
		
	}
	
	public String front() {
		if (isEmpty()) {
			throw new NullPointerException("A fila esta vazia");
		}
		
		return vetor[f];
		
	}

	public int size() {
		return tamanho;

	}

	public void print() {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetor[(f + i) % vetor.length] + " ;");
		}
		System.out.println();
	}
}
