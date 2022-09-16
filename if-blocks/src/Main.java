import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 8 ve 9 : If blokları
		
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Bir sayı girin: ");
		int sayi1 = girdi.nextInt();
		
		System.out.print("\nKıyaslamak için ikinci sayıyı girin: ");
		int sayi2 = girdi.nextInt();
		
		if(sayi1 == sayi2)
		{
			System.out.println("\nİki sayı eşittir.");
		}
		else if(sayi1 > sayi2)
		{
			System.out.println("\nİlk sayı daha büyük (" + sayi1 + ")");
		}
		else if(sayi1 < sayi2)
		{
			System.out.println("\nİkinci sayı daha büyük (" + sayi2 + ")");
		}

	}

}
