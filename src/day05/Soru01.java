package day05;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		// Girilen String değer içinde istenen indexteki karakteri bulan
		// Java kodunu yazınız.

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str = sc.nextLine();
		
		System.out.println("Lutfen index icin bir rakam giriniz");
		int indx= sc.nextInt();
		
		int sonuc= str.charAt(indx);
		
		System.out.println("1. cikti "+(char)sonuc);
		
		System.out.println("2. cikti "+str.charAt(indx));
		

	}

}
