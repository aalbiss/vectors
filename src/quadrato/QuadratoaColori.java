package quadrato;

import java.util.Scanner;

public class QuadratoaColori extends Quadrato{
	private String colore;

	public QuadratoaColori() {
		super();
		colore="";
	}


	public QuadratoaColori(int lato) {
		super(lato);	//chiamo il construttore del quadrato
		colore = "Nero";
	}

	public void inserimento() {
		Scanner KB=new Scanner(System.in);
		String colore;
		super.inserimento();
		System.out.println("inserisci colore");
		colore=KB.nextLine();
		setColore(colore);
	}

	public  void visualizza() {
		System.out.println("--quadrato a colori--");
		super.visualizza();
		System.out.println("--colore "+colore+"--");
	}

	public String toString() {

		return "QuadratoaColori "+ super.toString()+"[colore=" + colore + "]";
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

}
