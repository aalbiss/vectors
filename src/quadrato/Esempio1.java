package quadrato;

import java.util.ArrayList;

public class Esempio1 {

	public static void main(String[] args) {
		
		//ArrayList di String
		ArrayList<String> al1 =  new ArrayList<String>(3);
		al1.add("Ciao");
		al1.add("Mondo");
		for (String string : al1) {
			System.out.print(string + " ");
		}
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(3);
		al2.add(2);
		al2.add(45);
		for (Integer intero : al2) {
			System.out.print(intero);
		}
		

	}
	
}
