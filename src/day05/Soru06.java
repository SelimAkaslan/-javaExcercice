package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 * 1-5 arasinda random bir sayi olusturun.
		 * Kullanicadan 3 adet tahmin yapmasini isteyin.
		 * Bu tahminleri bir listeye aktarin
		 * Kullaniciya tahminlerini gosterin
		 * listedeki sayilar ile random olusturulan sayiyi karsilastirin
		 * esit ise kullaniciya tebrikler mesaji verin
		 * esit degilse tekrar tahmin alin.
		 * 
		 */
		
		Random rnd = new Random();
		int sayi = rnd.nextInt(5);
				
		List<Integer> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<<<<<Sayi Tahmin Oyununa HOsgeldiniz>>>>>>>>");
		do {
			System.out.println("Lutfen 1. Tahmini yapiniz");
			list.add(scan.nextInt());
			
			System.out.println("Lutfen 2. Tahmini yapiniz");
			list.add(scan.nextInt());
			
			System.out.println("Lutfen 3. Tahmini yapiniz");
			list.add(scan.nextInt());
			
			if (!list.contains(sayi)) {
				System.out.println("Tahminleriniz : "+list);
				System.out.println("Tutulan sayi : "+sayi);
				System.out.println("Tekrar Deneyiniz");
			}
			
		} while (!list.contains(sayi));
		System.out.println("Tahminleriniz : "+list);
		System.out.println("Tutulan sayi : "+sayi);
		System.out.println("KAZANDINIZ, Tebrikler");
		

	}

}
