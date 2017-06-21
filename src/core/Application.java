package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;
		int result = 0;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenue dans la super calculette du G4 !");

			System.out.println("Veuillez entrer le premier chiffre :");
			int a = Integer.parseInt(sc.nextLine());

			System.out.println("Veuillez entrer le deuxième chiffre :");
			int b = Integer.parseInt(sc.nextLine());

			System.out.println("Veuillez saisir l'opérateur : (+ - / *)");
			String operator = sc.nextLine();

			switch (operator) {
			case "+":
				System.out.println(a + b);
				result = a + b;
				break;
			case "-":
				System.out.println(a - b);
				result = a - b;
				break;
			case "*":
				System.out.println(a * b);
				result = a * b;
				break;
			case "/":
				System.out.println(a / b);
				result = a / b;
				break;
			}
			System.out.println("Continuer ? O/N");
			String input = sc.nextLine();

			if (input.equals("N"))
				flag = false;
		} while (flag);

		try {
			PrintWriter writer = new PrintWriter("resultat.txt", "UTF-8");
			writer.println(result);
			writer.close();
		} catch (IOException e) {
			// do something
		}
	}

}
