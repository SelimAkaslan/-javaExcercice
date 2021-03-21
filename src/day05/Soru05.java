package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*Kullanicidan 5 adet isim alin. Bunlari bir listeye ekleyin.
		 * indeksi 3 olan elemani silin. sildiginiz elemani yazdirin 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. ismi giriniz");
		String isim1 = scan.nextLine();
		System.out.println("Lutfen 2. ismi giriniz");
		String isim2 = scan.nextLine();
		System.out.println("Lutfen 3. ismi giriniz");
		String isim3 = scan.nextLine();
		System.out.println("Lutfen 4. ismi giriniz");
		String isim4 = scan.nextLine();
		System.out.println("Lutfen 5. ismi giriniz");
		String isim5 = scan.nextLine();
		
		List<String> list = new ArrayList<>();
		/* 1. Yol uzun olan
		list.add(isim1);
		list.add(isim2);
		list.add(isim3);
		list.add(isim4);
		list.add(isim5);
		*/
		
		// 2. yol en kisa
		list.add(scan.nextLine());
		
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		
	}

}
