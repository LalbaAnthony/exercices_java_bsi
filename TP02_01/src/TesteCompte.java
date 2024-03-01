
public class TesteCompte {
    public static void main(String[] args) {

        Compte c1 = new Compte();
        Compte c2 = new Compte();

        // dépôt de 500 euros sur le premier compte
        c1.deposer(500);

        // dépôt de 1000 euros sur le second compte.
        c2.deposer(1000);

        // retrait de 10 euros sur le second compte.
        c2.retirer(10);

        // virement de 75 euros du premier compte vers le second.
        c1.virerVers(75, c2);

        // affichage des soldes des deux comptes.
        c1.afficher();
        c2.afficher();
    }
}
