package Spesa_al_Supermercato;

public class Nodo<T> {

    private T valore;
    private Nodo<T> successivo;

    public Nodo( T valore ) {
        this.valore = valore;
        successivo = null;
    }

    public void setValore( T valore ) {
        this.valore = valore;
    }
    
    public T getValore() {
        return valore;
    }

    public Nodo<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Nodo<T> n) {
        successivo = n;
    }

    public String toString() {
        return "" + valore;
    }
}