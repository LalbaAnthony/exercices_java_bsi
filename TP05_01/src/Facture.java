package fr.nowhack.metier;

import fr.nowhack.utils.FactureException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Facture {
    List<Article> contenu = new ArrayList<>();
    private boolean isvalidee = false;
    private int numero;
    private String sep = String.format("%n*************************************************************************%n");

    public Facture(int numero) {
        this.numero = numero;
    }

    public void add(Article art) throws FactureException {
        if (this.isvalidee) {
            throw new FactureException("la facture est déja validée");
        } else if (art == null) {
            throw new FactureException("l'article ajouté est vide");
        } else {
            this.contenu.add(art);
        }
    }

    public void valide() throws FactureException {
        if (this.countArticles() == 0) {
            throw new FactureException("pas possible valider une facture vide");
        }
        this.isvalidee = true;
    }

    public double getTotal() {
        double total = 0;
        for (Article a : this.contenu) {
            total = total + a.getPrixTotal();
        }
        return total;
    }

    public int countArticles() {
        int nombre = 0;
        for (Article a : this.contenu) {
            nombre = nombre + a.getQuantite();
        }
        return nombre;
    }

    boolean isValide() {
        return this.isvalidee;
    }

    @Override
    public String toString() {
        DecimalFormat dfPrix = new DecimalFormat("0000.00");
        DecimalFormat dfqte = new DecimalFormat("00");
        int compteur = 0;
        String result = sep + complete(String.format("Facture %d", numero)) + sep;
        for (Article a : this.contenu) {
            String prixU = dfPrix.format(a.getPrix());
            String qte = dfqte.format(a.getQuantite());
            String prixT = dfPrix.format(a.getPrixTotal());
            String ligne = "";
            ligne = ligne.concat(String.format("n°%d %s: prixU = %s : nb = %s : prixT = %s", +

            +compteur, a.getNom(), prixU, qte, prixT));
            ligne = complete(ligne);
            result = result.concat(ligne);
        }
        result = result.concat(sep);
        String ligne = "";
        ligne = ligne.concat(String.format("%d articles, prix total : %.2f", this.countArticles(),

                this.getTotal()));

        ligne = complete(ligne);
        result = result.concat(ligne);
        result = result.concat(sep);
        return result;
    }

    private String complete(String texte) {
        StringBuffer texteFormate = new StringBuffer("* ");
        texteFormate.append(texte);
        int longTotal = sep.length() - 4; // 2 fois %n
        int nbEspaces = longTotal - texteFormate.length();
        for (int i = 0; i < nbEspaces - 1; i++)
            texteFormate.append(" ");
        texteFormate.append("*");
        return String.format("%s%n", texteFormate.toString());
    }
}