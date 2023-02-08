package examen;

import java.util.Scanner;

public class invertirCadena {	

	public static void main (String[] arg) {
		
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String s=sc.nextLine();
        
		String invertida = "";
		
		for (int indice = s .length() - 1; indice >= 0; indice--) {
			
			invertida += s.charAt(indice);
			
		}
		
		System.out.println("Cadena original: " + s);
		System.out.println("Cadena invertida: " + invertida);
		
	}
}
