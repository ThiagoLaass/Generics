package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        // Nesse exemplo vemos como o mesmo PrintService<T> pode lidar com Integer e também com Strings, e poderia facilmente lidar com outros tipos também.

		PrintService<Integer> psI = new PrintService<>(); // Demonstração com Integer
		PrintService<String> psS = new PrintService<>();  // Demonstração com String
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			psI.addValue(value); // adicionando valores inteiros na demonstração com integer
		}

        System.out.println("Saída:");
        psI.print(); // printando a demonstração com Integer 
		Integer x = psI.first();  
		System.out.println("Primeiro: " + x);  // printando o primeiro elemento na demonstração com Integer
        System.out.println("----------------------------------");
        

        System.out.print("Quantos valores? ");
	     n = sc.nextInt();
         sc.nextLine();
         for (int i = 0; i < n; i++) {
			String value = sc.nextLine();
			psS.addValue(value); // adicionando valores String na demonstração com String
		}

        System.out.println("Saída:");
        psS.print(); // printando a demonstração com String 
        String y = psS.first();  
		System.out.println("Primeiro: " + y);  // printando o primeiro elemento na demonstração com String


		
		sc.close();
	}
}