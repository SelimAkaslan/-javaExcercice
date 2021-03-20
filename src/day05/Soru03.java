package day05;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// Kullanıcıdan iki sayı girmesini ve ardından işlem seçmesi 
		// istenecek.
		// Tüm işlemler methodlarda yapılacak.
		// toplama , çıkartma, çarpma ve bölme
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		double sayi1 = scan.nextDouble();
		System.out.println("Lutfen 2. sayiyi giriniz");
		double sayi2 = scan.nextDouble();
		System.out.println("Dort islemden birinin seciniz");
		String islem = scan.next().toLowerCase();
		
		islem(islem,sayi1,sayi2);
		System.out.println(islem);
		
		

	}

	public static void islem(String islem,double sayi1,double sayi2) {
		
		switch(islem) {
		case "toplama":
			toplama(sayi1,sayi2);
			break;
		case "cikarma":
			cikarma(sayi1,sayi2);
			break;
		case "carpma":
			carpma(sayi1,sayi2);
			break;
		case "bolme":
			bolme(sayi1,sayi2);
			break;	
		default:
			System.out.println("Lutfen gecerli islem giriniz");
		}
		
	}

	public static void bolme(double sayi1, double sayi2) {
		System.out.println(sayi1/sayi2);
		
	}

	public static void carpma(double sayi1, double sayi2) {
		System.out.println(sayi1*sayi2);
		
	}

	public static void cikarma(double sayi1, double sayi2) {
		System.out.println(sayi1-sayi2);
		
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println(sayi1+sayi2);
		
	}

}
