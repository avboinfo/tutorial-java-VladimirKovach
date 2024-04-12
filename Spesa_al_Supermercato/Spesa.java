package Spesa_al_Supermercato;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Spesa {
    static Lista<Integer> list_of_Codes = new Lista<>();

    public Spesa() {};

    public void addProduct(int codice) {
        list_of_Codes.add(codice);
    }

    public void removeProduct() {
        list_of_Codes.remove();
    }

    public void showSpesa() {
        System.out.println(list_of_Codes);
    }

    public void writeFile() throws FileNotFoundException {
        File f = new File("Spesa_al_Supermercato/spesa.txt");
        PrintWriter writer = new PrintWriter(f);

        Nodo<Integer> p = list_of_Codes.root;
        while (p.getSuccessivo() != null) {
            p = p.getSuccessivo();
            writer.println(p.getValore());
        }
        writer.close();
    }
}