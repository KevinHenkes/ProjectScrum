package core;

import java.util.Scanner;
import java.math.*;

public class Application {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	boolean flag = true;
	
	do {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Bienvenue dans la super calculette du G4 !");

	    System.out.println("Veuillez entrer le premier chiffre :");
	    int a = Integer.parseInt(sc.nextLine());

	    System.out.println("Veuillez saisir l'opérateur : (+ - / * V p)");
	    String operator = sc.nextLine();
	    
	    String resultStr = "Le résultat est ";
	    if (!operator.equals(new String("V"))) {
	    	System.out.println("Veuillez entrer le deuxième chiffre :");
		    int b = Integer.parseInt(sc.nextLine());
		    
		    switch (operator) {
			    case "+":
					System.out.println(resultStr+ (a + b));
					break;
			    case "-":
					System.out.println(resultStr+ (a - b));
					break;
			    case "*":
					System.out.println(resultStr+ (a * b));
					break;
			    case "/":
					System.out.println(resultStr+ (a / b));
					break;
			    case "p":
			    	System.out.println(resultStr+ (Math.pow(a, b)));
		    }
	    } else {
	    	System.out.println(resultStr+ (Math.sqrt(a)));
	    }
	    
	    System.out.println("Continuer ? O/N");
	    String input = sc.nextLine();

	    if (input.equals("N"))
		flag = false;
	} while (flag);

    }

}
