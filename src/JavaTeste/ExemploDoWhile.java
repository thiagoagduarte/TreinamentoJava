package JavaTeste;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = 0;
		int num1, num2, resultado = 0;
		
		do {
			System.out.println("1)soma");
			System.out.println("2)subtra��o");
			System.out.println("3)multiplica��o");
			System.out.println("4)divis�o");
			System.out.println("0)sair");
			
			System.out.println("Digite o c�digo da opera��o desejada: ");
			x=in.nextInt();		
			
		if (x!=0) {
		
			System.out.println("Digite o primeiro n�mero: ");
			num1=in.nextInt();
			System.out.println("Digite o segundo n�mero: ");
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
		System.out.println("O resultado �: "+resultado);
		System.out.println();
		}
		} while (x != 0);
	}

}
