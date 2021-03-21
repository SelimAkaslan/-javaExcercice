package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru07 {

	public static void main(String[] args) {
		/*Bos bir liste olusturun. Sirasi ile 10,20,20,30,40,40,40, sayilarini listeye ekleyin
		 * 
		 * Method kullanarak  tekrar eden elemanlari silip listenin son uzunlugunu yazdiran bir program yazin
		 *  
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(70);
		list.add(40);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(60);
		
		Collections.sort(list);
		
		tekrarlariSilme(list);
		
		
		
		

	}

	public static void tekrarlariSilme(List<Integer> list) {
		
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i)!= list.get(i+1)) {
				temp.add(list.get(i));
			}
				
		}
		temp.add(list.get(list.size()-1));
		System.out.println(temp);
		System.out.println(temp.size());
	
	}
	

}
