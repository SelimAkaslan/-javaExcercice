package day01;

public class C5_Ornek5 {

	public static void main(String[] args) {
		/*
		 * Iki degisken atayin : num1=1, num2=1 ‘increment’ yontemini kullanarak Carpim
		 * Tablosunu yazdirin. Note: ++ increment isareti 1 arttirir. Asagidaki sekilde
		 * Carpim Tablosunu yazdirin: 1 X 1 = 1 1 X 2 = 2 1 X 3 = 3 ... 1 X 10 =10
		 */

		int num1 = 1;

		int num2 = 1;

		for (int i = num1; i <= 10; i++) {
			for (int j = num2; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}

		}
	}

}
