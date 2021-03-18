package day04;

import java.util.ArrayList;
import java.util.List;

public class C3_Soru3 {

	public static void main(String[] args) {
		/*
		 * iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each
		 * loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 * 
		 * Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		 */

		String arr1[]= {"Busra", "Ismail", "Selim","Burcu"};
		String arr2[]= {"Emre", "Ismail", "Mehmet","Burcu","Hasan"};
		
		List<String> ortakElemanlar = new ArrayList<>();
		for (String w : arr1) {
			for (String k : arr2) {
				if (w.equals(k)) {
					ortakElemanlar.add(w);
					
				}
				
			}
			
		}
		System.out.println(ortakElemanlar);
		
		
		
	}

}
