import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 21: mükemmel sayılar
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı girin: ");
		int sayi = input.nextInt();
		int toplam = 0;
		boolean perfect = false;
		
		for(int i = 1 ; i < sayi ; i++)
		{
			if(sayi % i == 0)
			{
				toplam += i;
			}
		}
		if(sayi == toplam)
		{
			System.out.println("\n" + sayi + " sayısı, mükemmel sayıdır.");
		}
		else System.out.println("\n" + sayi + " sayısı, mükemmel sayı DEĞİLDİR.");
		
	}

}
