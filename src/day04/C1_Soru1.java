package day04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C1_Soru1 {

	public static void main(String[] args) {
		/*
		 *1) Elemanlari A, C, E, ve F olan bir String ArrayList olu§turup ekrana yazdiriniz.
2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
3) set() methodu kullanarak, E’yi D yapiniz.
ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
4) remove() methodu kullanarak, F’yi siliniz.
ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
olmadigini dogrulayiniz.
7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.
9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz. */ 

		List<String>  list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		
		System.out.println(list);
		
		list.add("B");
		list.add(1,"L");
		
		System.out.println(list);
		
		list.set(3, "D");
		
		System.out.println(list);
		
		list.remove("F");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.contains("L"));
		System.out.println(list.contains("M"));
		
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		
	}

}
