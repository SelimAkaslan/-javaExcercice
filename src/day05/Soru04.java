package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru04 {
	public static void main(String[] args) {
		//Verilen iki adet array i liste cevirin
		//Daha sonra bu listleri siralayin
		//Son olarak esit olup olmadiklarini kontrol edin.
		// Esitlerse "Bu iki liste esittir"
		//Degillerse "Bu iki liste esit degildir" yazdirin
		
		//Integer arr1[] = {1,5,4,3,6,2,9,0,8,7};
		//Integer arr2[] = {4,3,2,5,8,7,0,9,1,6};
		
		Integer arr1[] = {1,5,4,3,6,2,9,0,8,7};
		Integer arr2[] = {4,3,2,5,8,7,0,9,1,6};
		
		List<Integer> list1= Arrays.asList(arr1);
		List<Integer> list2= Arrays.asList(arr2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		if (list1.equals(list2)) {
			System.out.println("Bu iki liste esittir");
			
		}else {
			System.out.println("Bu iki liste esit degildir");
		}
		
	}

}
