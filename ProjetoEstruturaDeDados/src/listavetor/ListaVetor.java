package listavetor;

public class ListaVetor {

	private String[] vetor;
	private int tamanho;

	public ListaVetor() {
		this.tamanho = 0;
		this.vetor = new String[tamanho];
	}

	// Metodos auxiliareis

	private void tornarMaior() {
		// Esse metodo ira fazer uma copia do vetor com mais um espaço null a o final
		// do vetor
		String[] tempVetor = new String[tamanho + 1];
		for (int i = 0; i < tamanho; i++) {
			tempVetor[i] = vetor[i];
		}
		
		vetor = tempVetor;
		
	}

	private void tonarMenor() {
		// Esse metodo ira fazer uma copia do vetor usando uma variavel temporaria, os
		// elementos nulos serão removidos do vetor
		String[] tempVetor = new String[tamanho - 1];
		int j = 0;
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] != null) {
				tempVetor[j] = vetor[i];
				j++;
			}

		}
		
		vetor = tempVetor;
	}

	// Metodos publicos

	public void add(String elemento) {
		// Esse metodo ira adicionar um elemento a o final do vetor, onde o elememto ira
		// substituir o valo null a o final do vetor
		tornarMaior();
		vetor[tamanho] = elemento;
		tamanho++;
	}

	public void add(int index, String elemento) {
		// Esse metodo empurra os elementos para o final da lista abrindo espaço para
		// adição do novo elememto
		tornarMaior();
		for (int i = tamanho - 1; i > index; i--) {
			vetor[i + 1] = vetor[i];
		}
		
		vetor[--index] = elemento;
		tamanho++;
	}

	public void set(int index, String elemento) {
		// Esse metodo substitui um elemeto por outro
		vetor[--index] = elemento;
	}

	public void remove(int index) {
		// Esse metodo remove um elemento de acordo com a posilcao atribuida
		vetor[--index] = null;
		tonarMenor();
		tamanho--;
	}

	public String get(int index) {
		// Esse metodo pega apenas um elemento presente na lista
		return vetor[--index];

	}

	public int size() {
		// Esse metodo retorna o tamanho da lista
		return tamanho;

	}

	public void print() {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetor[i] + ";");
		}
		
		System.out.println();
	}
}
