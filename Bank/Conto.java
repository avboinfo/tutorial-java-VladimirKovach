import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Conto {
    double saldo = 0.;

    public Conto(double saldo) { saldo = this.saldo; }
    public Conto() {
        this(0);
    }

    private void logFile(String s) throws FileNotFoundException {
        File f = new File("Bank/Log of the operations.txt");
        PrintWriter scrittore = new PrintWriter(f);
        scrittore.print(s);
        scrittore.close();
    }

    public boolean prelievo(double n) {
        double rest = saldo - n;
        if(rest >= 0) {
            saldo = rest;
            return true;
        }
        else
            return false;
    }

    public void versamento(double n) throws FileNotFoundException {
        saldo = saldo + n;
        String logStr = "Versamento è andato bene";
        logFile(logStr);
    }

    public void bonifico(Conto destinatario, double n, double interesse) throws FileNotFoundException {
        double rest_mit = this.saldo - n;
        double saldo_dest = destinatario.saldo + n;
        double i = n / 100;
        double interesse_somma = interesse * i;
        rest_mit = rest_mit - interesse;

        if(saldo_dest < 0 || rest_mit < 0) { System.out.println("Mancano i soldi, il saldo del mittente risulta negativo"); return; }

        destinatario.saldo = saldo_dest;
        this.saldo = rest_mit;
        String logStr = "Il bonifico è andao a buon fine con il tasso " + interesse_somma + "$ (" + interesse + "%)";
        System.out.println("\n" + logStr);
        System.out.println(" Il saldo del mittente: " + rest_mit);
        System.out.println(" Il saldo del destinatario: " + saldo_dest);
        logFile(logStr);
    }
    
    public String toString() {
        return "Saldo: " + saldo;
    }
}
