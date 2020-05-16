package Exercícios;

public class Ex1 {
	public static void main (String[] args)
	{
		int i,soma=0;
		for (i=1;i<=500;i++)
		{
			if(i%2 != 0 && i%3 ==0)
			{
				soma=soma+i;
			}
		}
		System.out.println("a soma é igual a: "+soma);
	}

}
