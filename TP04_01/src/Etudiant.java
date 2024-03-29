public class Etudiant {
    private int num;
    private String nom;
    private String prenom;
    private double moyenne;

    public Etudiant(int num, String nom, String prenom, double moyenne) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public String toString() {
        return "Etudiant [num=" + num + ", nom=" + nom + ", prenom="
                + prenom + ", moyenne=" + moyenne + "]";
    }

    
    public int compareTo(Etudiant e, String critere, String ordre) {
        if (critere.equals("num")) {
            if (ordre.equals("asc")) {
                return this.num - e.num;
            } else {
                return e.num - this.num;
            }
        } else if (critere.equals("nom")) {
            if (ordre.equals("asc")) {
                return this.nom.compareTo(e.nom);
            } else {
                return e.nom.compareTo(this.nom);
            }
        } else if (critere.equals("prenom")) {
            if (ordre.equals("asc")) {
                return this.prenom.compareTo(e.prenom);
            } else {
                return e.prenom.compareTo(this.prenom);
            }
        } else if (critere.equals("moyenne")) {
            if (ordre.equals("asc")) {
                return (int) (this.moyenne - e.moyenne);
            } else {
                return (int) (e.moyenne - this.moyenne);
            }
        } else {
            return 0;
        }
    }

}