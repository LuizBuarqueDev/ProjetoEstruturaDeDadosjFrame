package filavetor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FilaVetor filaVetor = new FilaVetor();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qualquer numero invalido resultara na finalização do codigo");
		
		while (true) {
			System.out.println("[1]-enqueue ; [2]-dequeue ; [3]-size ; [4]-isEmpty ; [5]-front ; [6]-print");

			String entrada = scanner.nextLine();
			if (entrada.equals("1")) {
				System.out.println("Digite o elemento: ");
				filaVetor.enqueue(scanner.nextLine());

			} else if (entrada.equals("2")) {
				System.out.println("Pop: " + filaVetor.dequeue());

			} else if (entrada.equals("3")) {
				System.out.println("Size: " + filaVetor.size());

			} else if (entrada.equals("4")) {
				System.out.println("isEmpty: " + filaVetor.isEmpty());

			} else if (entrada.equals("5")) {
				System.out.println("Front: " + filaVetor.front());

			} else if (entrada.equals("6")) {
				System.out.print("Fila: ");
				filaVetor.print();

			} else {
				System.out.println("Fim da operação\n Fila: ");
				break;
			}
		}
	}
}
