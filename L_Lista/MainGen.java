package L_Lista;

public class MainGen {
    public static void main( String[] args ) {
        NodoGen<String> n = new NodoGen<>("PRIVET");
        System.out.println( n );
        NodoGen<Float> nf = new NodoGen<>(12.2f);
        System.out.println( nf );

        ListaGen<String> ls = new ListaGen<>();
        ls.addTail(n);
    } 
}
