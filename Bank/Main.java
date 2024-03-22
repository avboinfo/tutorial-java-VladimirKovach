import java.io.FileNotFoundException;

public class Main {
    
    public static void main (String[] args) throws FileNotFoundException {
        Conto contoDiGiulietta = new Conto();
        contoDiGiulietta.versamento(2000.);
        contoDiGiulietta.prelievo(500.);
        contoDiGiulietta.prelievo(400.);
        System.out.println(contoDiGiulietta);
        Conto contoDiRomeo = new Conto();
        contoDiGiulietta.bonifico(contoDiRomeo, 200, 10);
        
    }
}