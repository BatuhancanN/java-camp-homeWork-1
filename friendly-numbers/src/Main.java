import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 22: arkadaş sayılar
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen ilk sayıyı girin: ");
		int sayi1 = input.nextInt();
		int top1 = 0;
		
		System.out.print("Lütfen ikinci sayıyı girin: ");
		int sayi2 = input.nextInt();
		int top2 = 0;
		
		for(int i = 1 ; i < sayi1 ; i++)
		{
			if(sayi1 % i == 0)
			{
				top1 += i;
			}
		}
		for(int j = 1 ; j < sayi2 ; j++)
		{
			if(sayi2 % j == 0)
			{
				top2 += j;
			}
		}
		
		if(top1 == sayi2 && top2 == sayi1)
		{
			System.out.print("\n" + sayi1 + " ve " + sayi2 + ", arkadaş sayılardır.");
		}
		else System.out.print("\n" + sayi1 + " ve " + sayi2 + ", arkadaş sayı DEĞİLDİR.");

		
		
	}

}
