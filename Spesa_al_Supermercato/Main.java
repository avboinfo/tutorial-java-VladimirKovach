package Spesa_al_Supermercato;

import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Prodotto prodotti = new Prodotto(0, null, 0);
        prodotti.caricaFile();
        prodotti.showProducts();

        Spesa spesa = new Spesa();
        spesa.addProduct(22121);
        spesa.showSpesa();
        spesa.removeProduct();
        spesa.showSpesa();

        spesa.addProduct(1);
        spesa.addProduct(21231);
        spesa.addProduct(21);
        spesa.addProduct(21321231);
        spesa.writeFile();
    }
}
