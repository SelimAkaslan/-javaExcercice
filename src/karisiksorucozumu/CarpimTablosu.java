package karisiksorucozumu;

public class CarpimTablosu {

	public static void main(String[] args) {
		 /* BBBBBB 3. soru   Problem Tanımı
	       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
	       Örnek Ekran çıktısı
	       1 2 3 4 5
	       2 4 6 8 10
	       3 6 9 12 15
	       4 8 12 16 20
	       5 10 15 20 25
	       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
	       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
	       ekrana basan bir kod yazabilirsiniz.   */
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 5; j++)
	            { System.out.print(i*j+" "); }
	            System.out.println();
	        }
	    
	

	}

}
