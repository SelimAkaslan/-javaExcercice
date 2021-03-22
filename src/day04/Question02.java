package day04;

public class Question02 {

	public static void main(String[] args) {
		/*
	     * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
	     *
	     * input[]= {1,2,3,4,5,6,7}
	     * Output : 4
	     */
		double ortalama=0;
		double toplam=0;
		int arr[]= {1,2,3,4,5,6,7};
		for (int w : arr) {
			toplam+=w;
			
		}
		double sonuc = toplam/(arr.length);
		System.out.println(sonuc);
		
	}

}
