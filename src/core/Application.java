package core;

import java.util.Scanner;
import java.math.*;

public class Application {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		boolean flag = true;
		
		System.out.println("Bienvenue dans la super calculette du G4 !");
		
		do {
		    Scanner sc = new Scanner(System.in);
		    
		    String testSc;
		    do {
		    	System.out.println("Veuillez entrer le premier chiffre :");
		    	testSc = sc.nextLine();
			} while (!isInteger(testSc));		    
		    int a = Integer.parseInt(testSc);
	
		    do {
		    	System.out.println("Veuillez saisir l'opérateur : (+ - / * V p)");
		    	testSc = sc.nextLine();
			} while (!testSc.equals(new String("+")) 
					&& !testSc.equals(new String("-")) 
					&& !testSc.equals(new String("/")) 
					&& !testSc.equals(new String("*")) 
					&& !testSc.equals(new String("V")) 
					&& !testSc.equals(new String("p")));		    
		    String operator = testSc;
		    
		    String resultStr = "Le résultat est ";
		    if (!operator.equals(new String("V"))) {
		    	do {
		    		System.out.println("Veuillez entrer le deuxième chiffre :");
			    	testSc = sc.nextLine();
				} while (!isInteger(testSc));		
			    int b = Integer.parseInt(testSc);
			    
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
    
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

}
