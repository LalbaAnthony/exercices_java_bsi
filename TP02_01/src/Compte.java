class Compte {
    private String nom = "";
    private int solde = 0;

    Compte(String nom, int solde) {
        this.nom = nom;
        this.solde = solde;
    }

    // ======== NOM ========
    void setNom(String nom) {
        this.nom = nom;
    }

    String getNom() {
        return nom;
    }
    // =====================

    // ======== SOLDE ========

    void setSolde(int solde) {
        this.solde = solde;
    }

    int getSolde() {
        return solde;
    }

    void deposer(int montant) {
        solde = solde + montant;
    }

    void retirer(int montant) {
        solde = solde - montant;
    }
    // =====================

    void virerVers(int montant, Compte destination) {
        this.retirer(montant);
        destination.deposer(montant);
    }

    void afficher() {
        System.out.printf("Nom: %s, Solde: %d\n", nom, solde);
    }
}
