package JavaTeste;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = 0;
		int num1, num2, resultado = 0;
		
		do {
			System.out.println("1)soma");
			System.out.println("2)subtração");
			System.out.println("3)multiplicação");
			System.out.println("4)divisão");
			System.out.println("0)sair");
			
			System.out.println("Digite o código da operação desejada: ");
			x=in.nextInt();		
			
		if (x!=0) {
		
			System.out.println("Digite o primeiro número: ");
			num1=in.nextInt();
			System.out.println("Digite o segundo número: ");
			num2=in.nextInt();
			
		switch (x) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
		}

		System.out.println();
		System.out.println("O resultado é: "+resultado);
		System.out.println();
		}
		} while (x != 0);
	}

}
