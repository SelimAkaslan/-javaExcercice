package day02;

import java.util.Scanner;

public class C5_Ornek5 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ilk kisinin dogum yilini giriniz");
		int birthYearOfYusuf = scan.nextInt();
		System.out.println("Lütfen ilk kisinin dogum ayini giriniz");
		int birthMonthOfYusuf = scan.nextInt();
		System.out.println("Lütfen ilk kisinin dogum gununu giriniz");
		int birthDayOfYusuf = scan.nextInt();

		System.out.println("Lütfen ikinci kisinin dogum yilini giriniz");
		int birthYearOfMehmet = scan.nextInt();
		System.out.println("Lütfen ikinci kisinin dogum ayini giriniz");
		int birthMonthOfMehmet = scan.nextInt();
		System.out.println("Lütfen ikinci kisinin dogum gununu giriniz");
		int birthDayOfMehmet = scan.nextInt();

		if (birthYearOfYusuf < birthYearOfMehmet) {
			System.out.println("Yusuf Mehmet'ten buyuk");

		} else if (birthYearOfMehmet == birthYearOfYusuf) {
			if (birthMonthOfYusuf < birthMonthOfMehmet) {
				System.out.println("Yusuf Mehmet'ten buyuk");

			} else if (birthMonthOfYusuf == birthMonthOfMehmet) {
				if (birthDayOfYusuf < birthDayOfMehmet) {
					System.out.println("Yusuf Mehmet'ten buyuk");
				} else {
					System.out.println("Yusuf ve Mehmetin yaslari ayni");

				}
				
			}

		} else {
			System.out.println("Mehmet Yusuf'dan buyuk");
		}

		/*
		 * if (birthYearOfYusuf < birthYearOfMehmet) {
		 * System.out.println("Yusuf Mehmet'ten buyuk");
		 * 
		 * }else if (birthYearOfMehmet == birthYearOfYusuf) { if (birthMonthOfYusuf <
		 * birthMonthOfMehmet) { System.out.println("Yusuf Mehmet'ten buyuk"); }
		 * 
		 * }else if (birthMonthOfYusuf == birthMonthOfMehmet) { if (birthDayOfYusuf <
		 * birthDayOfMehmet) { ç }else { System.out.println("Yusuf Mehmet'ten buyuk"); }
		 * 
		 * }else { System.out.println("Mehmet Yusuf'dan buyuk");
		 * 
		 * }
		 */
	}
}
