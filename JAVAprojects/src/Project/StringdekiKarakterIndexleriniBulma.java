package Project;

public class StringdekiKarakterIndexleriniBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String metin = "Bugün Java ile string konusunu işleyeceğiz";
		// Verilmiş olsun. Metin değişkeninin içinde “i” harfinin geçtiği yerlerin indeksini bir while loop ve indexOf metodlarını kullanarak bulup ekrana yazdıran bir program yazınız. Çıktı şu şekilde olmalı 
		// i harfinin geçtiği yerler: 11, 18, 31, 40
		
		// indexOf METODU
		
		// indexOf string içerisinde arama yapmamızı sağlar

		// indexOf metodu iki şekilde çalışır 1 parametre ve 2 parametre vererek
		// ilk parametre herzaman string içerisinde aranacak metindir eğer sadece ilk parametreyi girersek 
		// o karakteri stringin başından başlayarak aramaya başlar bulursa durur ve bize girdiğimiz metnin ilk karakterinin index numarasını döndürür
		
		// ikinci parametreye aramaya kaçıncı indexten başladığını verebiliriz 
		// ikinci parametreyi girdiğimizde o indexten sonrasını arar eğer girdiğimiz metin var ise index numarası yoksa -1 döndürür
		
		// eğer girdiğimiz metin stringin içerisinde bir den fazla var baştan aramaya başlayıp buldugunda durdugu için bize ilk bulunduğu indexi döndürür
		
	
		String metin = "Bugün Java ile string konusunu isleyeceğiz";	
		String bosMetin = "";
		int sayac = 0;
		int index = 0;
		
		while(sayac < metin.length()) {
			
			int deger = metin.indexOf("i" , sayac);
			
			if(deger >= 0) {
				
				sayac = deger;
				bosMetin += Integer.toString(deger) + " ,";
				
				
			}
			
			sayac++;
		}
		
		System.out.println("Sonuc = " + bosMetin);
		
		
	}
	
}
