package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggtabell;
	private int nesteledige;

	// TODO: objektvariable

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledige = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledige = 0;
	}

	public int getAntall() {
		return nesteledige;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i].erLik(innlegg) && innleggtabell[i]!=null) {
				return i;

			}

		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledige; i++) {
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

		throw new UnsupportedOperationException(TODO.method());
	}

	public String toString() {
		return 
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