package JavaTeste;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero inicial: ");
		int numeroInicial = entrada.nextInt();
		System.out.println("Digite o n�mero final: ");
		int numeroFinal = entrada.nextInt();
		int numeroAtual = numeroInicial;
		while (numeroAtual <= numeroFinal)
		{
			System.out.println(numeroAtual);
			numeroAtual++;
		}
	}

}
