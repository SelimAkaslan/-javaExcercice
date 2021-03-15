package day03;

public class OgretmenBilgileri {
	/*
	 *  Soru Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin ve yazdirin 
     */
	
	static String ogretmenIsmi;
	static String ogretmenBransi;
	
	public OgretmenBilgileri(String brans, String isim) {
		this.ogretmenBransi = brans;
		this.ogretmenIsmi= isim;
		
	}
	

	public OgretmenBilgileri() {
		
	}


	public static void main(String[] args) {
		OgretmenBilgileri ogretmen1 = new OgretmenBilgileri("Fen", "Velihan");
		System.out.println(ogretmen1.ogretmenBransi);

		OgretmenBilgileri ogretmen2 = new OgretmenBilgileri();
		ogretmen2.ogretmenBransi = "Mat ";
		ogretmen2.ogretmenIsmi ="Can";
		
		System.out.println(ogretmen2.ogretmenBransi + ogretmen2.ogretmenIsmi);
	}

}
