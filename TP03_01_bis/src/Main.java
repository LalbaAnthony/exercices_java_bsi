public class Main {
    public static void main(String[] args) {

        // Triplet d'integer
        System.out.println("Tripet d'integer");
        Triplet<Integer> ti = new Triplet(1, 2, 3);
        ti.affiche();

        // Triplet de double
        System.out.println("Tripet de double");
        Triplet<Double> td = new Triplet(1.1, 2.2, 3.3);
        td.affiche();

        // TripletH de plusieurs types
        System.out.println("TripetH de plusieurs types");
        TripletH<Integer, Double, String> th = new TripletH(1, 2.2, "trois");
        th.affiche();

        // Tableau de TripletH
        System.out.println("Tableau de TripletH");
        TripletH<Integer, Double, String>[] tab = new TripletH[2];
        tab[1] = new TripletH(4, 5.5, "six");
        TripletH.afficheTableau(tab);
    }
}