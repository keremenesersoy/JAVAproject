package Project;

public class DizidekiTekrarSayisiniBulma {

public static void main(String[] args) {
		
		int arr[] = {1,4,4,7,9,8,6,4,3,2,6,8,5};
		
		tekrarSayisiBul(arr);
		

	}
	
	public static void tekrarSayisiBul(int[] sayiDizisi) {
		
		int sayi = -1;
		int tekrarSayisi = 0;
		
		for(int i = 0; i < sayiDizisi.length ; i++) {
			
			int sayac = 0;
			
			for(int j = 0 ; j < sayiDizisi.length ; j++) {
				
				if(sayiDizisi[j] == sayiDizisi[i]) {  sayac++;  }
			
			}		
			sayac--;
			
			if(sayac > 0) {
				
				tekrarSayisi = ++sayac;
				sayi = sayiDizisi[i];
				break;
			}
		}
			
		if(tekrarSayisi > 0) {
			System.out.println(sayi + " sayisi " + tekrarSayisi + " kez tekrar ediyor");
		}
		else {
			System.out.println("Tekrar eden sayi bulunamamistir");
		}
	}
		
}
