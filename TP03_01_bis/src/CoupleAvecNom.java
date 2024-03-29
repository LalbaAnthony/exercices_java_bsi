class CoupleAvectNom extends Couple {
    private String nom;

    public CoupleAvectNom(int a, int b, String nom) {
        super(a, b);
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return "(" + getA() + ", " + getB() + ", " + nom + ")";
    }
}