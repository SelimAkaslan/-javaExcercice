package day02;

import java.util.Scanner;

public class C3_Ornek3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan olusturmak istedigi bir gmail adi isteyin kullanicinin girdigi
		 * gmail adresinin gecerli olup olmadigini kontrol edin - kullanici adi buyuk
		 * harf icermemeli - kullanici adi en az 6 harf olmali(icinde en az bir sayi
		 * veya karekter olmali ) - @gmail.com icinde farkli karekter, sayi ve harf
		 * olmamali
		 * 
		 * Gecerli kullanici adini girince "Mailiniz basarili bir sekilde olusturuldu"
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);

		String mail = "";
		int result = 0;

		do {
			System.out.println("Lutfen olusturmak istediginiz gmail adresini giriniz");
			mail = scan.nextLine();
			result = buyukHarfOlmasin(mail) + sayiVarMi(mail) + ozelKarVarMi(mail) + uzunlukUygunMu(mail)
					+ gmailOlmali(mail);

		} while (result != 5);
		System.out.println("Mailiniz basarili bir sekilde olusturuldu");

		
scan.close();
	}

	
	private static int gmailOlmali(String mail) {
		String etSonrasi = "@gmail.com";
		int flagEt=0;
	       int index=0;
	       
	       while(index<mail.length()) {
	           if (mail.endsWith(etSonrasi)) {
	               flagEt=1;
	           } 
	           index++;
	       }
	       
	       if (flagEt==0) {
	           System.out.println("Mail @gmail.com icermelidir");
	       }
	       
	       return flagEt;
	}


	private static int uzunlukUygunMu(String mail) {
		int sonucUzunluk=0;
	       if (mail.length()<=6) {
	           System.out.println("Mail en az 6 karakter olmalidir");
	       } else {
	           sonucUzunluk=1;
	       }
	       return sonucUzunluk;
	}


	private static int ozelKarVarMi(String mail) {
		int flagOzel=0;
	       int index=0;
	       
	       while(index<mail.length()) {
	           if (mail.charAt(index)>=' ' && mail.charAt(index)<='/') {
	               flagOzel=1;
	           } 
	           index++;
	       }
	       
	       if (flagOzel==0) {
	           System.out.println("Mail ozel karakter icermelidir");
	       }
	       
	       return flagOzel;
	}


	public static int sayiVarMi(String mail) {
		int flagSayi = 0;
		int index = 0;
		while (index < mail.length()) {
			if (mail.charAt(index) >= '0' && mail.charAt(index) <= '9') {
				flagSayi = 1;

			}
			index++;

		}
		if (flagSayi == 0) {
			System.out.println("Mail en az bir sayi icermelidir");
		}
		return flagSayi;
	}

	
	public static int buyukHarfOlmasin(String mail) {
		int flagBuyuk = 0;
		int index = 0;

		while (index < mail.length()) {
			if (!(mail.charAt(index) >= 'A' && mail.charAt(index) <= 'Z')) {
				flagBuyuk = 1;
			}
			index++;
		}

		if (flagBuyuk == 0) {
			System.out.println("Mail buyuk harf icermemelidir");
		}

		return flagBuyuk;
	}

}
