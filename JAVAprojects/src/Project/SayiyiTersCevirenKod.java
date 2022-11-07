package Project;

import java.util.Scanner;

public class SayiyiTersCevirenKod {

	public static void main(String[] args) {
		

		//   SORU 1 -----------------------------------
		// Kullanıcının girdiği pozitif bir tamsayıyı (int) ters çeviren ve görüntüleyen bir uygulama yazın. (Not: String ve char kullanarak yapınız) 
		
		
		Scanner degerAl = new Scanner(System.in);
		
		
		System.out.print("Sayi giriniz = ");
		int sayi = degerAl.nextInt();
		
		System.out.println("Girilen sayi = " + sayi);
		
		String deger = Integer.toString(sayi);
		
		for(int i = deger.length() - 1 ; i >= 0 ; i--) {
			
			System.out.print(deger.charAt(i));
			
		}
		
	
		
		

	}

}
