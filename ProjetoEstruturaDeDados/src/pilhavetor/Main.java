package pilhavetor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Qualquer numero invalido resultara na finalização do codigo");
		PilhaVetor pilhaVetor = new PilhaVetor();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("[1]-push(x) ; [2]-pop() ; [3]-size() ; [4]-top() ; [5]-isEmpty() ; [6]-print()");
			String entrada = scanner.nextLine();

			if (entrada.equals("1")) {
				System.out.print("Push: Elemento:");
				pilhaVetor.push(scanner.nextLine());

			} else if (entrada.equals("2")) {
				System.out.println("Pop: " + pilhaVetor.pop());

			} else if (entrada.equals("3")) {
				System.out.println("Size: " + pilhaVetor.size());

			} else if (entrada.equals("4")) {
				System.out.println("Top: " + pilhaVetor.top());

			} else if (entrada.equals("5")) {
				String status = pilhaVetor.isEmpty() ? "Vazia" : "Comtem elemento";
				System.out.println("isEmpty: " + status);

			} else if (entrada.equals("6")) {
				pilhaVetor.print();

			} else {
				System.out.println("Fim da operação\n Fila: ");
				pilhaVetor.print();
				break;
			}
		}
	}
}