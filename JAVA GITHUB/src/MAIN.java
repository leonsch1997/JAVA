import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		
		//show_words(1);
		show_numbers(4);
	}
	
	public static void show_words(int n)
	{
	//varialbes
	Scanner input = new Scanner(System.in);
	String[] palabra = new String[n];
			
	//input
	System.out.println("Ingrese 10 palabras");
	for(int i=0;i<palabra.length;i++)
		{
		System.out.println("palabra "+(i+1)+": ");
		palabra[i] = input.next();
		}
	input.close();
	
	//output
	System.out.println("Palabras Ingresadas");
	for(int i=0;i<palabra.length;i++)
		{
		System.out.println((i+1)+": "+palabra[i]);
		}
	}
	
	public static void show_numbers(int n)
		{
		//varialbes
		Scanner input = new Scanner(System.in);
		String[] numbers = new String[n];
		String[] mayores = new String[n];
		int inicial = 0;
		int j = 0;
				
		//input 
		System.out.println("Ingrese el primer Numero");
		inicial = input.nextInt();
		
		System.out.println("Ingrese "+n+" Numeros");
		for(int i=0;i<numbers.length;i++)
			{
			System.out.println("numero "+(i+1)+": ");
			numbers[i] = input.next();
			
			//Es mayor?
			int aux = Integer.parseInt(numbers[i]);
			if(aux > inicial)
				{
					mayores[j] = numbers[i];
					j++;
				}
			
			}
		input.close();
		
		//output
		System.out.println("Palabras Ingresadas");
		for(int i=0;i<mayores.length;i++)
			{
			if(mayores[i] != null)
				{System.out.println((i+1)+": "+mayores[i]);}
			}
		}
}