package pilhaencadeada;

public class No {
	
	private String dado;
	private No prev;
	
	public No(String dado) {
		super();
		this.dado = dado;
		this.prev = null;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public No getPrev() {
		return prev;
	}

	public void setPrev(No prev) {
		this.prev = prev;
	}
}
