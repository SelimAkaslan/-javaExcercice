package day02;

import java.util.Scanner;

public class C2_Ornek2 {

	public static void main(String[] args) {
		/*
		 * kullanicidan parkurun cinsini isteyin
		 * parkur tehlikeli hizi 100
		 * parkur duz 150
		 * 
		 * kullanici hizini girsin
		 * hizini kac saniyede ideal hiza getirecegini soyleyelim
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen parkur tipini giriniz(tehlikeli veya normal)");
		String parkur = scan.nextLine().toLowerCase();
		System.out.println("Lutfen hizinizi giriniz(Km/H)");
		int hiz = scan.nextInt();
		
		if (parkur.equalsIgnoreCase("tehlikeli")) {
			if (hiz>=100) {
				for (int i = hiz; i >100; i-=10) {
					int sure = (i-100)/10;
					System.out.println(sure + " saniye sonra ideal hiziniza ulasacaksiniz");
					
					System.out.println("Hiziniz : " + i + " Yavaslayiniz!");
					
				}
				System.out.println("Ideal hiza ulastiniz");
				
			}else {
				System.out.println("Ideal hizdasiniz");
			}
			
		} else if (parkur.equalsIgnoreCase("normal")) {
			if (hiz>=150) {
				for (int i = hiz; i >150; i-=10) {
					int sure = (i-150)/10;
					System.out.println(sure + " saniye sonra ideal hiziniza ulasacaksiniz" );
					System.out.println("Hiziniz : " + i + " Yavaslayiniz!");
				}
				System.out.println("Ideal hiza ulastiniz");
				
			}else {
				System.out.println("Ideal hizdasiniz");
			}
			
		}else {
			System.out.println("Lutfen gecerli bir parkur tipi giriniz");
		}
		
scan.close();
	}

}
