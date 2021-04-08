package karisiksorucozumu;

import java.util.Scanner;

public class HarfUcgenSorusu {

	public static void main(String[] args) {
		/* CCCCCC 1.soru
	    A
	    B B
	    C C C
	    D D D D
	    E E E E E
	    F F F F F F
	    şekli yazdırınız*/
	int A=65;
	        for (int satir = 1; satir <= 6; satir++) {
	            for (int harf = 1; harf <=satir; harf++) {
	                System.out.print((char) A+" ");
	            }A++;
	            System.out.println();
	        }
	  

	}

}
