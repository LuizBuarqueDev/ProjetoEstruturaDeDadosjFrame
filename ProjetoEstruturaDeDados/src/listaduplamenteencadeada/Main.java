package listaduplamenteencadeada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qualquer numero invalido resultara na finalização do codigo");

		while (true) {
			System.out.println(
					"[1]-add(x) ; [2]-add(index, x) ; [3]-remove(posição) ; [4]-set(index,x) ; [5]-size() ; [6]-get(posição) ; [7]-print()");
			String entrada = scanner.nextLine();

			if (entrada.equals("1")) {
				System.out.print("Add: Elemento:");
				listaDuplamenteEncadeada.add(scanner.nextLine());

			} else if (entrada.equals("2")) {
				System.out.print("Add: Posição:");
				int index = Integer.parseInt(scanner.nextLine());
				System.out.print("Add: Elemento:");
				listaDuplamenteEncadeada.add(index, scanner.nextLine());

			} else if (entrada.equals("3")) {
				System.out.print("Remove: Posição:");
				listaDuplamenteEncadeada.remove(Integer.parseInt(scanner.nextLine()));

			} else if (entrada.equals("4")) {
				System.out.println("Set: Posição:");
				int posicao = Integer.parseInt(scanner.nextLine());
				System.out.print("Set: Elemento:");
				listaDuplamenteEncadeada.set(posicao, scanner.nextLine());

			} else if (entrada.equals("5")) {
				System.out.println("Size:" + listaDuplamenteEncadeada.size());

			} else if (entrada.equals("6")) {
				System.out.print("Get: Posição:");
				int posicao = Integer.parseInt(scanner.nextLine());
				System.out.println("Get:" + listaDuplamenteEncadeada.get(posicao));

			} else if (entrada.equals("7")) {
				System.out.print("Print: ");
				listaDuplamenteEncadeada.print();

			} else {

				System.out.println("Fim da operação\n Fila: ");
				listaDuplamenteEncadeada.print();
				break;
			}
		}
	}
}