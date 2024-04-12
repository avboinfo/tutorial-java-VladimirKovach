package Spesa_al_Supermercato;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prodotto {
    static Lista<Prodotto> list_of_Products = new Lista<>();
    int codice;
    String descrizione;
    float costo;

    public Prodotto(int codice, String descrizione, float costo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
    }

    public int getCodice() {
        return codice;
    }

    public void caricaFile() throws FileNotFoundException {
        File f = new File("Spesa_al_Supermercato/prodotti.csv");
        Scanner leggi = new Scanner(f);
        leggi.nextLine();
        while(leggi.hasNextLine()) {
            String s = leggi.nextLine();
            String[] fields = s.split(";");
            Prodotto p = new Prodotto(Integer.parseInt(fields[0]), fields[1], Float.parseFloat(fields[2]));
            list_of_Products.add(p); 
        }
        leggi.close();
    }

    public void showProducts() {
        System.out.println(list_of_Products);
    }

    public String toString() {
        return "Codice: " + codice + "; Descrizione: " + descrizione + "; Costo: " + costo;
    } 
}
