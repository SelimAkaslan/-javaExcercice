package day05;

public class Soru02 {

	public static void main(String[] args) {
		// saat ve dakika girildiğinde bize saniye retur eden methodu yazalım.
		
		
		System.out.println("islemin sonucu : "+saniyeDonusturme(3,25));
		
		

	}

	public static int saniyeDonusturme(int saat, int dakika) {
		int sonuc = (saat*3600) + (dakika*60);
		return sonuc;
	
		
		
	}

}
