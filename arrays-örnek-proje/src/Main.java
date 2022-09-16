
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 15: recap 2
		
		double[] sayilar = {1.1,2.9,0.1,9.9,4.9,0.9};
		
		double toplam = 0;
		double min = sayilar[0];
		double max = sayilar[0];
		
		for(double sayi:sayilar)
		{
			if(min > sayi)
			{
				min = sayi;
			}
			if(max < sayi)
			{
				max = sayi;
			}
			toplam = max+min;
			
			System.out.println(sayi);
			
		}
		System.out.println("\nEn büyük sayı: " + max);
		System.out.println("En küçük sayı: " + min);
		System.out.println("\nBüyük ve küçük sayıların toplamı: " + toplam);
	}

}
