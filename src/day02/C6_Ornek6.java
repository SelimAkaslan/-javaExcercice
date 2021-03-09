package day02;

import java.util.Scanner;

public class C6_Ornek6 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
		 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol
		 * edelim.
		 * 
		 * Ucgen olma kosullari. b+c>a>b-c 1 a+c>b>a-c 1 a+b>c>a-b 1
		 * 
		 * Eskenar ucgen olma kosullari. a=b=c
		 * 
		 * Konsolda asagidaki durumlari yazdiralim. Eskenar ucgen Sadece ucgen Ucgen
		 * degildir
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 3 tane tamsayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		if (sayi1 > 0 && sayi2 > 0 && sayi3 > 0) {
			if ((sayi1 + sayi3) > sayi1 && sayi1 > (sayi2 - sayi3)) {
				System.out.println("Sayilar ucgen olusturur");
				if (sayi1 == sayi2 && sayi2 == sayi3) {
					System.out.println("Eskenar ucgen");

				}
			} else {
				System.out.println("Sayilar ucgen olusturmaz");
			}

		} else if (sayi1 + sayi3 > sayi2 && sayi2 > sayi1 - sayi3) {

			if (sayi1 == sayi2 && sayi2 == sayi3) {
				System.out.println("Sayilar ucgen olusturur");
				if (sayi1 == sayi2 && sayi2 == sayi3) {
					System.out.println("Eskenar ucgen");

				}

			} else {
				System.out.println("Sayilar ucgen olusturmaz");
			}

		} else if (sayi1 + sayi2 > sayi3 && sayi3 > sayi1 - sayi2) {
			if (sayi1 == sayi2 && sayi2 == sayi3) {
				System.out.println("Sayilar ucgen olusturur");
				if (sayi1 == sayi2 && sayi2 == sayi3) {
					System.out.println("Eskenar ucgen");
				}

			} else {
				System.out.println("Sayilar ucgen olusturmaz");
			}

		} else {
			System.out.println("Girdiniz sayilar Ucgen olusturmaz");
		}
scan.close();
	}

}
