package karisiksorucozumu;

public class DikUcgenSorusu {

	public static void main(String[] args) {
		 /*AAAAAAAA 2. soru  Problem Tanımı
	    Girilen bir sayı kadar satır ve sütünu olan ve
	    sol kenara dayalı üçgeni basan kodu yazınız.
	            Ekran Çıktısı
	   Bir sayi giriniz: 5
	            *
	            **
	            ***
	            ****
	            *****     */
	        for (int satir = 1; satir <=5; satir++) {
	            for (int yıldız = 1; yıldız <=satir ; yıldız++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	// EEEEEEEE  sağ kenara dayalı
	        for (int satir = 1; satir <=5 ; satir++) {
	            for (int bosluk = 1; bosluk <=5-satir ; bosluk++)
	            { System.out.print(" "); }
	            for (int yıldız = 1; yıldız <=satir ; yıldız++)
	            { System.out.print("*"); }
	            System.out.println();
	        }
	   
	    

	}

}
