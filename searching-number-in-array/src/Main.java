import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 23: dizide sayı bulma
		
		Scanner input = new Scanner(System.in);
		
		int[] liste = {2790,2117,3127,8214,4648,4186,1105,3185,2894,3534,33,6791,4107,8931,5202,6027,7662,5603,5890,7487};
		boolean var = false;
		
		System.out.print("Bir sayı girin: ");
		int sayi = input.nextInt();
		
		for(int num:liste)
		{
			if(sayi == num)
			{
				var = true;
				break;
			}
		}
		if(var)
		{
			System.out.println("\n" + sayi + " sayısı, listede VAR.");
		}
		else System.out.println("\n" + sayi + " sayısı, listede YOK.");

	}

}
