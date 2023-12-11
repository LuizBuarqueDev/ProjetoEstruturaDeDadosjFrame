package pilhaencadeada;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Qualquer numero invalido resultara na finalização do codigo");
		PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("[1]-push(x) ; [2]-pop() ; [3]-size() ; [4]-top() ; [5]-isEmpty() ; [6]-print()");
			String entrada = scanner.nextLine();

			if (entrada.equals("1")) {
				System.out.print("Push: Elemento:");
				pilhaEncadeada.push(scanner.nextLine());

			} else if (entrada.equals("2")) {
				System.out.println("Pop: " + pilhaEncadeada.pop());

			} else if (entrada.equals("3")) {
				System.out.println("Size: " + pilhaEncadeada.size());

			} else if (entrada.equals("4")) {
				System.out.println("Top: " + pilhaEncadeada.top());

			} else if (entrada.equals("5")) {
				String status = pilhaEncadeada.isEmpty() ? "Vazia" : "Comtem elemento";
				System.out.println("isEmpty: " + status);

			} else if (entrada.equals("6")) {
				pilhaEncadeada.print();

			} else {

				System.out.println("Fim da operação\n Fila: ");
				pilhaEncadeada.print();
				break;
			}
		}
	}
}