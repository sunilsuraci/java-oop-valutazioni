package it.corso.valutazioni;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		CalcolaValutazione[] cv = new CalcolaValutazione[20];
		
		Random randomGen = new Random();
		
		System.out.println(Arrays.toString(cv));
		
		int id;
		int percAssenze;
		double mediaVoti;
		for(int i = 0; i <cv.length; i++) {
			id = i +1;
			percAssenze = randomGen.nextInt(101);
			mediaVoti = randomGen.nextDouble() * 5.0;
			

			cv[i] = new CalcolaValutazione(id, percAssenze, mediaVoti);
			System.out.print("Valutazione studente id " + cv[i].idStudente);
			System.out.print(", percentuale assenze " + cv[i].percentualeAssenze);
			System.out.println(", media voti " + cv[i].mediaVoti);
			
			if(cv[i].promosso()) {
				System.out.println("Promosso");
			} else {
				System.out.println("Bocciato");
			}
		}
		
	}

}
