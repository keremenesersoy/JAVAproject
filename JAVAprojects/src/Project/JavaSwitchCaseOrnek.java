package Project;

import java.util.Scanner;

public class JavaSwitchCaseOrnek {

	public static void main(String[] args) {
		
		System.out.println("1- Kelimeleri Buyuk Harf Yap");
	    System.out.println("2- kelimenin harflerini Kucuk yap");
	    System.out.println("3- kelimenin harflerinin arasina ? koy");
	    System.out.println("4- kelimenin basindaki ve sonundaki bosluklari silin");
	    System.out.println("5- kelimenin icindeki butun a harflerini ? ile degistirin");
	    System.out.println("6- kelimenin ilk uc indexinin alip sonuna ... koyun\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kelime Giriniz = ");
        String kelime = scan.nextLine();
       
        System.out.print("Sayi Giriniz = ");
        int secim = scan.nextInt();
        
        switch (secim) {
		case 1: {
			System.out.println(kelime.toUpperCase());
			break;
		}
		case 2: {
			System.out.println(kelime.toLowerCase());		
			break;
		}
		case 3: {
			System.out.println(kelime.replace("", " ").trim().replace(" ", "?"));
			break;
		}
		case 4: {
			System.out.println(kelime.trim());
			break;
		}
		case 5: {
			System.out.println(kelime.replaceAll("a", "?"));
			break;
		}
		case 6: {
			System.out.println(kelime.substring(0,3).concat("..."));
			break;
		}
		default:
			System.out.println("Yanlis secim yaptiniz !");
		}
	}

}
