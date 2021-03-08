package day01;

import java.util.Scanner;

public class C4_Ornek4 {

	public static void main(String[] args) {
	
		/*
		Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini 
		konsolda yazdiran programi yaziniz.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
		if (sayi>=99 && sayi<=999) {
			int birlerBasamagi= sayi%10;
			sayi/=10;
			int onlarBasamagi=sayi%10;
			sayi/=10;
			int yuzlerBasamagi=sayi%10;
			sayi/=10;
			
			int basamakToplami= birlerBasamagi+onlarBasamagi+yuzlerBasamagi;
			
			System.out.println("Girdiginiz sayinin basamak degerleri toplami : "+basamakToplami );
		} else {
			System.out.println("Girdiginiz sayi 3 basamakli degil");

		}
		scan.close();
	}

}
