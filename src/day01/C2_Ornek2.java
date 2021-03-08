package day01;

import java.util.Scanner;

public class C2_Ornek2 {

	public static void main(String[] args) {
		/*
		Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. 
		Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
		*/  
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gunde kac bardak cay ictiginizi giriniz");
		int bardakSayisi = scan.nextInt();
		System.out.println("Cayi kac sekerli icersiniz?");
		int sekerSayisi= scan.nextInt();
		
		double sekerGr= 1.7;
	
		double sonuc = ((bardakSayisi*sekerSayisi)*365)*sekerGr/1000;
		System.out.println(sonuc + " kg/yil");
		
scan.close();
	}

}
