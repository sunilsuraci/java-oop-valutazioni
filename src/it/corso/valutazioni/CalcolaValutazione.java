package it.corso.valutazioni;

public class CalcolaValutazione {
		
		
	
		int idStudente;
		int percentualeAssenze;
		float mediaVoti;
		CalcolaValutazione( int idStudente, int percentualeAssenze, float mediaVoti) {
			this.idStudente = idStudente;
			this.percentualeAssenze = percentualeAssenze;
			this.mediaVoti = mediaVoti;
		}
		
		void CalcolaValutazione() {
			if (percentualeAssenze < 50);{
				System.out.println("Bocciato");
			}  if (percentualeAssenze < 50 && percentualeAssenze >= 20 && mediaVoti > 2.0) {
				System.out.println("Promosso");
			} else if (percentualeAssenze < 25 && mediaVoti < 2.0) {
				System.out.println("Promosso");
			}
			
		}
}