package examen;

import java.util.Scanner;

public class fizzBuzz {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args)  {
		
		for(int x = 1; x <= 100; x++) {
			if(FizzBuzz(x, 15) == 0) {
				System.out.println(x + ": FizzBuzz.");
			}
			else if(FizzBuzz(x, 3) == 0) {
				System.out.println(x + ": Fizz.");
			}
			else if(FizzBuzz(x, 5) == 0) {
				System.out.println(x + ": Buzz.");
			}
			else if(FizzBuzz(x, 1) == 0) {
				System.out.println(x + "\t");
			}
		}
			
	}
	static public int FizzBuzz(int a, int b) {
		return a%b;
	}

}
