import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 10 : switch-case
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı girin(1,2,3): ");
		
		int secim = girdi.nextInt();
		
		switch(secim)
		{
		case 1:
			System.out.println("Birinci seçenek");
			break;
		case 2:
			System.out.println("İkinci seçenek");
			break;
		case 3:
			System.out.println("Üçüncü seçenek");
			break;
		default:
			System.out.println("Lütfen geçerli bir sayı girin...");
			break;
		}

	}

}
