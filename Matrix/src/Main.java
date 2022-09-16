
public class Main 
{

	public static void main(String[] args) 
	{
		// Ders 16: matrix
		
		String[][] cihazlar = new String[2][2];
		cihazlar[0][0] = "Buz dolabı";
		cihazlar[0][1] = "Çamaşır makinesi";
		cihazlar[1][0] = "Akıllı saat";
		cihazlar[1][1] = "Akıllı gözlük";
		
		for(int i = 0 ; i < 2 ; i++)
		{
			System.out.println("---------------------------");
			for(int j = 0; j < 2 ; j++)
			{
				System.out.println(cihazlar[i][j]);
			}
		}

	}

}
