package L_Lista;

public class Nodo {

    private int valore;
    private Nodo successivo;

    public Nodo( int valore ) {
        this.valore = valore;
    }

    public void setValue( int nuovoValore ) {
        valore = nuovoValore;
    }

    public void setNext( Nodo nuovoSuccessivo ) {
        successivo = nuovoSuccessivo;
    } 

    public int getValue() {
        return valore;
    }

    public Nodo getNext() {
        return successivo;
    }

    public String toString() {
        return "[" + valore + "]";
    }
}

