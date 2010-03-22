package main;

import implementHomeMaid.Fpri;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fpri<String> test = new Fpri<String>();
		test.ajoute("Process 1",5);
		test.ajoute("Process 2",8);
		test.ajoute("Process 3",5);
		test.ajoute("Process 4",1);
		
		Fpri<String> test2 = new Fpri<String>();
		test2.ajoute("Process 5",3);
		test2.ajoute("Process 6",7);
		test2.ajoute("Process 7",8);
		test2.ajoute("Process 8",1);
		System.out.println("affichage : ");
		test.afficherFile();
		test2.afficherFile();
		test.fusionne(test2);
		System.out.println("affichage : ");
		test.afficherFile();
		System.out.println();
		//implementArrayList.Elem.afficher(test.maxElem());
	}

}
