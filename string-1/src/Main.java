
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 17: string 1
		
		String mesaj = "Ankara'da hava 33 derece.";
		System.out.println(mesaj);

		System.out.println("Karakter sayısı: " + mesaj.length());
		System.out.println("16.karakter: " + mesaj.charAt(15));
		System.out.println(mesaj.concat(" Çok sıcak."));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.startsWith("a"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.endsWith("e"));
		System.out.println(mesaj.indexOf("."));
		System.out.println(mesaj.lastIndexOf("A"));
		
		char[] karakterler = new char[6];
		mesaj.getChars(0,6,karakterler,0);
		System.out.println(karakterler);
		
		System.out.println("--------------------------------------");
		// Ders 18: string 2
		
		String yeniMesaj = mesaj.replace('3', '2');
		System.out.println(yeniMesaj);
		
		System.out.println(yeniMesaj.substring(10));
		System.out.println(yeniMesaj.substring(10,14));
		
		String yazi = "Ankara İstanbul";
		for(String kelime : yazi.split(" "))
		{
			System.out.println(kelime);
		}
		
		System.out.println(yeniMesaj.toLowerCase());
		System.out.println(yeniMesaj.toUpperCase());
		System.out.println(yeniMesaj.trim()); //baş ve sondaki boşlukları atar
	}

}
