
public class ListeComptes {
    public static void main(String[] args) {

        // Create a array of 10
        Compte[] comptes = new Compte[10];

        // Fill the comptes array with
        for (int i = 0; i < comptes.length; i++) {
            comptes[i] = new Compte();
            comptes[i].deposer(200);
            comptes[i].deposer(i * 100);
            comptes[i].afficher();
        }
    }
}
