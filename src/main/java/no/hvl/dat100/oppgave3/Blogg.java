package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggtabell;
	private int nesteledig;

	// TODO: objektvariable

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {

			}

		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].getId() == innlegg.getId()) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggtabell.length; i++) {
	        if (innleggtabell[i] == null) {
	            return true;  
	        }
	    }
	    return false; 
		
	}

	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} 
	
		return false;
		
	}

	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}
}

	// valgfrie oppgaver nedenfor

//	public void utvid() {
//		throw new UnsupportedOperationException(TODO.method());
//	}
//
//	public boolean leggTilUtvid(Innlegg innlegg) {
//
//		throw new UnsupportedOperationException(TODO.method());
//
//	}
//
//	public boolean slett(Innlegg innlegg) {
//
//		throw new UnsupportedOperationException(TODO.method());
//	}
//
//	public int[] search(String keyword) {
//
//		throw new UnsupportedOperationException(TODO.method());
//
//	}
//}