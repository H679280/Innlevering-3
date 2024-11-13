package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        String filbane = mappe + "/" + filnavn;

        try (PrintWriter writer = new PrintWriter(filbane)) {
            writer.print(samling.toString()); 
            return true; 
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke skrive til fil: " + e.getMessage());
            return false; 
        }
    }
}
