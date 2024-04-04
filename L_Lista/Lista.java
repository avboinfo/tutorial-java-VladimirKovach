package L_Lista;

public class Lista {

    class Iteratore {
        private Nodo nodo;
        private Iteratore(Nodo nodo) {
            this.nodo = nodo;
        }
        public boolean hasNext() {
            return nodo!=null;
        }
        public Nodo next() {
            if (nodo==null) return null;
            // Nodo result = new Nodo( nodo.getValore(), nodo.getNext() );
            Nodo result = nodo;
            nodo = nodo.getNext();
            return result;
        }
    }

    public Iteratore getIterator() {
        Iteratore i = new Iteratore(radice);
        return i;
    }

    Nodo radice;

    class Iterator {
        private Nodo nodo;
        private Iterator(Nodo nodo) {
            this.nodo = nodo;
        }
        public boolean hasNext() {
            return nodo != null;
        }
    }

    public Lista() {
        radice = null;
    }

    public boolean isEmpty() {
        return radice==null;
    }

    public void add( int data ) {
        Nodo n = new Nodo(data);
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getNext()!=null) p = p.getNext();
            p.setNext(n);
        }
    }
    public void add( Nodo n ) {
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getNext()!=null) p = p.getNext();
            p.setNext(n);
        }
    }

    public void addHead( int data ) {
        Nodo n = new Nodo(data);
        if (!isEmpty()) {
            radice = n;
        } else {
            n.setNext(radice);
            radice = n;
        }
    }
    public void addHead( Nodo n ) {
        if (!isEmpty()) {
            radice = n;
        } else {
            n.setNext(radice);
            radice = n;
        }
    }

    public void addSorted( int data ) {
        Nodo n = new Nodo(data);
        if (isEmpty()) { radice=n; n.setNext(null); return; }
        int vn = n.getValue();
        if (vn<radice.getValue()) { n.setNext(radice); radice=n; return; }
        Nodo p1 = radice;
        Nodo p2 = radice.getNext();
        while ( p2!=null && vn>p2.getValue() ) {
            p1=p2;
            p2=p2.getNext();
        }
        n.setNext(p2);
        p1.setNext(n);
    }
    public void addSorted( Nodo n ) {
        if (isEmpty()) { radice=n; n.setNext(null); return; }
        int vn = n.getValue();
        if (vn<radice.getValue()) { n.setNext(radice); radice=n; return; }
        Nodo p1 = radice;
        Nodo p2 = radice.getNext();
        while ( p2!=null && vn>p2.getValue() ) {
            p1=p2;
            p2=p2.getNext();
        }
        n.setNext(p2);
        p1.setNext(n);
    }

    public void addPos( int data, int position ) {
        Nodo n = new Nodo(data);
        if (isEmpty()) { radice = n; n.setNext(null);  return; }
        if (position == 0) { n.setNext(radice); radice = n; return; }

        Nodo p = radice;
        int k = 0;
        while (p.getNext() != null && k < position-1) { 
            k++;  
            p = p.getNext();
        }
        n.setNext(p.getNext());
        p.setNext(n);
    }
    public void removePos( int position ) {
        if (isEmpty()) { return; }
        if (position == 0) { radice = radice.getNext(); return; }

        Nodo p_pre = null;
        Nodo p = radice;
        int k = 0;
        while (p != null && k < position) {
            k++;
            p_pre = p;
            p = p.getNext();
        }
        p_pre.setNext(p.getNext());
    }

    public String toString() {
        String s = "Elementi della lista: ";
        Nodo p = radice;
        while (p!=null) {
            s += p + " ";
            p = p.getNext();
        }
        s += "End!\n";
        return s;
    }
}
