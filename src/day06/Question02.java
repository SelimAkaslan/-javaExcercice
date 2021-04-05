package day06;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
	 	Kullanicidan yasini alin ve eger kullanici yasini 0 veya daha az bir yas girerse
	 kullaniciya musade etmeyin(Exception throw edin)
	 */
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        try {
        	 if (yas<0) {
            throw new IllegalArgumentException();
             
     		}else {
     			System.out.println("Yasiniz : "+yas);
     		}
		} catch (Exception e) {
			System.out.println("Yasiniz sifirdan kucuk olamaz");
		}
       
	}

}
