package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de notas: ");
		int number = sc.nextInt();

		for (int cont = 0; cont < number; cont++) {
			System.out.print("Informe uma nota: ");
			int grade = sc.nextInt();

			if (grade >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
		sc.close();
	}
}
