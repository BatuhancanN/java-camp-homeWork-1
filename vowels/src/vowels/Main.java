package vowels;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		// Ders 20: sesli harfler
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir harf girin: ");
		
		String girdi = input.next();
		char harf = girdi.charAt(0);
		
		
		boolean ince = false;
		
		char[] inceSes = {'E','e','İ','i'};
		char[] kalinSes = {'I','ı','A','a','O','o','U','u'};
		
		for(char i:inceSes)
		{
			for(char k:kalinSes)
			{
				if(harf == i)
				{
					ince = true;
					break;
				}
				else if(harf == k)
				{
					break;
				}
			}
		}
		if(ince)
		{
			System.out.println("\n" + harf + " harfi, İNCE seslidir.");
		}
		else System.out.println("\n" + harf + " harfi, KALIN seslidir.");

	}

}
