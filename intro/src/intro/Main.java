package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Internet Subesi";
			
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar dustu resmi");
		}else if(dolarBugun > dolarDun) {
			System.out.println("Dolar yukseldi resmi");
		}else {
			System.out.println("Dolar esittir resmi");
		}
		System.out.println("---------");
		
		String kredi1 = "Hizli Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Ciftci kredisi";
		String kredi5 = "Mbs kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "Kultur bakanligi kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		System.out.println("---------");
		
		String[] krediler = 
			{
				"Hizli Kredi", 
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Ciftci kredisi",
				"Mbs kredisi",
				"Meb kredisi",
				"Kultur bakanligi kredisi"
				};
		
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("---------");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);  //20
		
		int[] sayilar1 = {1, 2, 3, 4, 5};
		int[] sayilar2 = {10, 20, 30, 40, 50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);  //100
		
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "Izmir";
		System.out.println(sehir1);  //Istanbul
	}
}
