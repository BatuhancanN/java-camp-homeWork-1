import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 12: while
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kaça kadar saymak istersiniz? \n");
		int tekrarSayisi = girdi.nextInt();

		if(tekrarSayisi <= 1)
		{
			System.out.println("Lütfen 1'den büyük bir sayı girin.");
		}
		else
		{
			int i = 0;
			while(i < tekrarSayisi)
			{
				i++;
				System.out.println(i);
			}
		}
	}

}
