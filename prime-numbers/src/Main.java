import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 19: Asal sayılar
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Bir sayı girin: ");
		int sayi = girdi.nextInt();
		
		boolean asal = true;
		
		if(sayi == 1)
		{
			System.out.print("\n" + sayi + " sayısı, asal DEĞİLDİR.");
			return;
		}
		
		if(sayi < 1)
		{
			System.out.print("\n GEÇERSİZ");
			return;
		}
		
		for(int i = 2 ; i < sayi ; i++)
		{
			if(sayi % i == 0)
			{
				asal = false;
			}
		}
		if(asal)
		{
			System.out.print("\n" + sayi + " sayısı, ASALDIR.");
		}
		else System.out.print("\n" + sayi + " sayısı, asal DEĞİLDİR.");

	}

}
