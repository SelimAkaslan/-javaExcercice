package day06;

import java.util.ArrayList;
import java.util.List;

public class Question06 {
    /*
    Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
    String str=“ilovejavatoo” 
    Output: o v a
    */
	public static void main(String[] args) {
		String str = new String("ilovejavatoo");
		ArrayList<Character> charList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
			
		}
		//System.out.println(charList);
		tekrarliKarekter(charList);
	}
	public static void tekrarliKarekter(ArrayList<Character> a) {
		String tekrarli = "";
		for (int i = 0; i < a.size(); i++) {
			for (int j = i+1; j < a.size(); j++) {
				if (a.get(i)==a.get(j) && !tekrarli.contains(a.get(i)+"")) {
					tekrarli +=a.get(i)+ " ";
					
				}
				
			}
			
		}
		System.out.println(tekrarli);
	}

}
