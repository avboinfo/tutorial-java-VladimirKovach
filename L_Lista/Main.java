package L_Lista;

public class Main {
    
    public static void main (String[] args) {
        System.out.println("Partiti!");
        
        Lista l = new Lista();
        l.addSorted(2);
        l.addSorted(5);
        l.addSorted(7);
        l.addSorted(3);

        l.addPos(4, 2);
        System.out.println(l);
        l.addPos(21, 1);
        System.out.println(l);
    } 

}
