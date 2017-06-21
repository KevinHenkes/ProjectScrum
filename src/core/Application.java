package core;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans la super calculette du G4 !");
		
		System.out.println("Veuillez entrer le premier chiffre :");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Veuillez entrer le deuxième chiffre :");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Veuillez saisir l'opérateur : (+ - / *)");
		String operator = sc.nextLine();
		
		
	}

}
