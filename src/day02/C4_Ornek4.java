package day02;

import java.util.Scanner;

public class C4_Ornek4 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iş unvanınızı girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doğru jobTitle yazdırmak için aşağıdaki test datalarini kullanın. Example :
        Eger jobTitle  qa ise print “İş unvanınız Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iş unvanınızı girin");

		String isAdi = scan.nextLine();
		switch (isAdi) {
		case "qa":
			System.out.println("İş unvanınız Quality Analyst");
			
			break;
		case "dev":
			System.out.println("İş unvanınız Developer");
			
			break;
		case "ba":
			System.out.println("İş unvanınız Business Analyst");
			
			break;
			
		case "pm":
			System.out.println("İş unvanınız Project Manager");
			
			break;
			
		default:
			System.out.println("Gecerli bir is unvani giriniz");
			break;
		}
	scan.close();	
	}

}
