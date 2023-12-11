package listaduplamenteencadeada;

public class NoDuplo {
	

	private String dado;
	private NoDuplo next;
	private NoDuplo prev;

	public NoDuplo() {
		// TODO Auto-generated constructor stub
	}

	public NoDuplo(String dado) {
		super();
		this.dado = dado;
		this.next = null;
		this.prev = null;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public NoDuplo getNext() {
		return next;
	}

	public void setNext(NoDuplo next) {
		this.next = next;
	}

	public NoDuplo getPrev() {
		return prev;
	}

	public void setPrev(NoDuplo prev) {
		this.prev = prev;
	}

}
