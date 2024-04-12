package Spesa_al_Supermercato;

public class Lista<T> {
    Nodo<T> root;

    public Lista() {
        this.root = null;
    }

    public void add( Nodo<T> n) {
        if (root == null) {
            root = n;
        } else { 
            Nodo<T> p = root;
            while (p.getSuccessivo() != null) p = p.getSuccessivo();
            p.setSuccessivo(n);
        }
    }
    public void add( T v ) {
        add(new Nodo<T>(v));
    }

    public void remove() {
        if (root == null) {
            System.out.println("La lista è vuota");
        }
        else {
            Nodo<T> p = root; 
            Nodo<T> pp = root.getSuccessivo();
            if(pp == null) { //se c'e solo un elemnto
                root = null; return;
            }
            while (pp.getSuccessivo() != null)  {
                p = p.getSuccessivo();
                pp = pp.getSuccessivo();
            }
            p.setSuccessivo(p);
        }
    }
    
    public String toString() {
        String s = "\n*** LIST BEGIN ***\n";
        Nodo<T> p = root;
        while (p != null) {
            s += p + "\n";
            p = p.getSuccessivo();
        }
        s += "*** The END OF THE LIST ***\n";
        return s;
    }
}
