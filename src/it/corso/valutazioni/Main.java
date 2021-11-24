package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		CalcolaValutazione[] randomCalcolaValutazione = new CalcolaValutazione[20];
		
		Random randomGenerator = new Random();
		int idStudente, percentualeAssenze;
		float mediaVoti;
		for(int i= 0; i < randomCalcolaValutazione.length; i++) {
			idStudente = i+1;
			percentualeAssenze = randomGenerator.nextInt(100) +1;
			randomCalcolaValutazione[i] = new CalcolaValutazione(idStudente, percentualeAssenze, mediaVoti);
			System.out.println("ID Studente: " + randomCalcolaValutazione[i].idStudente + "percentuale assenze: " );
		}
		
	}

}
