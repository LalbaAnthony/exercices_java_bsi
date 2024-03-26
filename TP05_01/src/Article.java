
public class Article {
    private String nomArticle;
    private int quantite;

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    private double prix;

    public Article(String nom, int kod, double price) {
        this.nomArticle = complete(nom);
        this.quantite = kod;
        this.prix = price;
    }

    public double getPrixTotal() {
        return getPrix() * getQuantite();
    }

    public String getNom() {
        return this.nomArticle;
    }

    private String complete(String texte) {
        StringBuffer texteFormate = new StringBuffer("");
        texteFormate.append(texte);
        int longTotal = 20;
        int nbEspaces = longTotal - texteFormate.length();
        for (int i = 0; i < nbEspaces - 1; i++)
            texteFormate.append(" ");
        return texteFormate.toString();
    }
}