package day04;

import java.util.Arrays;

public class C2_Soru2 {

	public static void main(String[] args) {
		// Bir String olusturunuz, bu String’deki character’leri for-each loop
		// kullanarak yazdiriniz. ipucu: split()

		String str = "Java calismak kolay oldu";
		String[] krktr = str.split("");
		for (String w : krktr) {

		}
		System.out.println(Arrays.toString(krktr));

	}

}
