package day02;

import java.util.Scanner;

public class C7_Ornek7 {

	public static void main(String[] args) {
		/* 
		Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu yazdıran switch case java kodunu yazinız.
				 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 1 ila 7 arasinda bir sayi giriniz");
		int gun =  scan.nextInt();
		
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			

		default:
			System.out.println("Gecerli bir rakam giriniz");
			break;
		}
		scan.close();
	}

}
