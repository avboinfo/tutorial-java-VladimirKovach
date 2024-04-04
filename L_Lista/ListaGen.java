package L_Lista;

public class ListaGen<T> {
    NodoGen<T> root;

    public ListaGen() {
        this.root = null;
    }

    public void addTail( NodoGen<T> n) {
        if (root == null) {
            root = n;
        } else { 
            NodoGen<T> p = root;
            while (p.getSuccessivo() != null) p = p.getSuccessivo();
            p.setSuccessivo(n);
        }
    }
    public void addTail( T v ) {
        addTail(new NodoGen<T>(v));
    }
    
    public String toString() {
        String s = "\n*** LIST BEGIN ***";
        NodoGen<T> p = root;
        while (p != null) {
            s += p + "\n";
            p = p.getSuccessivo();
        }
        s += "*** The END OF THE LIST ***\n";
        return s;
    }
}
