package karisiksorucozumu;

public class PiramirSorusu {

	public static void main(String[] args) {
		 /*
		Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
		Sonuç böyle olmalıdır;
		       *
		      * *
		     * * *
		    * * * *
		   * * * * *     */
		        for (int satir = 1; satir <=5 ; satir++) {
		            for (int bosluk =1 ; bosluk <=5-satir ; bosluk++)
		            { System.out.print(" ");}
		            for (int yildiz = 1; yildiz <=satir ; yildiz++)
		            { System.out.print("* "); }
		            System.out.println();
		        }

	}

}
