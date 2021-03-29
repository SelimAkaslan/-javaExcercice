package day05;

import java.util.ArrayList;
import java.util.List;

public class Question01 {

	/*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
	public static void main(String[] args) {
		
		String arr1[]=  {"John","Brad","Ange","Sofia","Emily"};
		String arr2[]= {"sofia","brad","grace","emily","hazel"};

		ortakEleman( arr1,arr2);
	}

	public static void ortakEleman(String[] arr1,String[] arr2) {
		List<String> list = new ArrayList<>();
		for(String w:arr1) {
            for(String k:arr2) {
                if(w.equalsIgnoreCase(k)) {
                    list.add(w);
                }
            }
            
        }
        System.out.print(list);
    }
}



