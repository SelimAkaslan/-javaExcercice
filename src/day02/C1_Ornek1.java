package day02;

import java.util.Scanner;

public class C1_Ornek1 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan cinsiyet ve yas alip emekli olup olmayacagini yazdiran bir
		 * java programi yaziniz Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		 * olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz.(Cinsiyetinizi belirtmek istemiyorsaniz bos gecebilirsini)");
		String cinsiyet = scan.nextLine().toLowerCase();
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (cinsiyet.equalsIgnoreCase("kadin")) {
			if (yas>=60) {
				System.out.println("Emekli olabilirsiniz");
				
			}else if(yas>0 && yas<60) {
				System.out.println("Emeklilik hakkiniz dolmamistir");
			}else if(yas<0) {
				System.out.println("Gecerli bir yas giriniz");
			}
			
		} else if(cinsiyet.equalsIgnoreCase("erkek")) {
			if (yas>=65) {
				System.out.println("Emekli olabilirsiniz");
				
			}else if(yas>0 && yas<65) {
				System.out.println("Emeklilik hakkiniz dolmamistir");
			}else if(yas<0) {
				System.out.println("Gecerli bir yas giriniz");
			}

		}else if(cinsiyet.equals("")) {
			if (yas>=65) {
				System.out.println("Erkek veya kadin emekli olabilirsiniz ");
				
			}else if(yas>60 && yas<65) {
				System.out.println("Erkek iseniz emeklilik yasi 65, kadin iseniz emekli olabilirsiniz ");

			} 
			else if(yas>0 && yas <60) {
				System.out.println("Emekli olamazsiniz");

			}else {
				System.out.println("Lutfen gecerli bir yas giriniz ");
			}
		} else {
			System.out.println("Lutfen cinsiyetinizi giriniz");
		}
scan.close();
	}

	
}
