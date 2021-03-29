package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class Question02 {
	/*
 	Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
 	yaziniz. Kullanici deger girmek istemedigi zaman donguyu kirin
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arrList= new ArrayList<>();
		int count=0;
		do {
			System.out.println("Deger girmek istiyorsaniz 'E' ye, istemiyorsaniz 'H' ye basiniz");
			char secim= scan.next().toUpperCase().charAt(0);
			if (secim=='E') {
				System.out.println("Lutfen bir String deger giriniz");
				arrList.add(scan.next());
				
			} else if(secim=='H'){
				System.out.println("Eklemeleriniz icin tesekkur ederim, iyi gunler");
				break;

			}else {
				count++;
				if (count==3) {
					System.out.println("3 kere yanlis girdiniz bloke oldu");
					break;
					
				}
				System.out.println("Yanlis giris yaptiniz tekrar deneyiniz");
			}
			
		} while (true);
		System.out.println(arrList);
		
		
		

	}

}
