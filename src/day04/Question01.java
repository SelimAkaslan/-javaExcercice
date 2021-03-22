package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {
	/*
     * Kullanicidan bir isim alin ve bu ismi char array'ine donusturen bir method yazin
     * 
     *
     * (toCharArray methodunu kullanmayin)
     *
     * Input : John
     * Output : [J, o, h, n]
     */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.next();
		
		charaDonustur(isim);
		
	}

	public static void charaDonustur(String isim) {
	
	char harfler[] = new char[isim.length()];
	for (int i = 0; i < isim.length(); i++) {
		harfler[i]= isim.charAt(i);
		
		
	}
	System.out.println(Arrays.toString(harfler));
	
		
	}

}
