package modele;

import observer.I_Observateur;

public interface I_modeleGrille {
    public void addObservateur(I_Observateur o);
    public void removeObservateur(I_Observateur o);
    public void notifyObservateur();
    public boolean ajouterMotHoriz(String string,int i, int j);
    public int getHauteur();
    public int getLargeur();
    public char[][] getTableauDeCases();
}
