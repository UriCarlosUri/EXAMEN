package examen;

import java.util.Scanner;

public class primeraMayuscula {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String s=sc.nextLine();
		
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		System.out.println(s);
		
	}
	

}
