package filaencadeada;

public class No {
	
	private String dado;
	private No next;
	
	public No(String dado) {
		this.dado = dado;
		this.next = null;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}
}