package quadrato;

import java.util.Vector;

public class Vettori {

	public static void main(String[] args) {
		
//		Vector v1 = new Vector();  //old
		
//		Costruttore di default (parentesi vuote)
		Vector<Quadrato> v = new Vector<Quadrato>(3,2);	//new		

//		System.out.println("Prima...");
//		System.out.println("Size     = " + v.size());		//  --> numero di elementi presenti nel vettore
//		System.out.println("Capacità = " + v.capacity());	//  --> capacità dell'vettore (DINAMICA)
//		
//		v.add(new Quadrato(1));
//		v.add(new Quadrato(2));
//		System.out.println("------------------------");
//		System.out.println("Dopo...");
//		System.out.println("Size     = " + v.size());			
//		System.out.println("Capacità = " + v.capacity());	
//
//		v.add(new Quadrato(3));
//		v.add(new Quadrato(4));
//		System.out.println("------------------------");
//		System.out.println("Ancora dopo...");
//		System.out.println("Size     = " + v.size());			
//		System.out.println("Capacità = " + v.capacity());	
//		
//		v.add(new Quadrato(5));
//		v.add(new Quadrato(6));
//		v.add(new Quadrato(7));
//		System.out.println("------------------------");
//		System.out.println("Ancora dopo del dopo...");
//		System.out.println("Size     = " + v.size());			
//		System.out.println("Capacità = " + v.capacity());	
//		
//		System.out.println("------------------------");
//		for (int i = 0; i < v.size(); i++) {
//			System.out.println(v.get(i));
//		}
	
		
		//CRUD
		for (int i = 0; i <=5; i++) {
			int lato = (int) (Math.random()*10+1);
			Quadrato q = new Quadrato(lato);
			v.add(q);
		}
		
		System.out.println("------------------------");
		for (Quadrato q : v) {
			System.out.println(q);
		}
		
//		System.out.println("------------------------");
//		for (int i = 0; i < v.size(); i++) {
//			System.out.println(v.get(i));
//		}

		//INSERISCE IL
		v.add(0, new Quadrato(100));
		//trimToSize ---> taglia fino al size
			
	}

}
