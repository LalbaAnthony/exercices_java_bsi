package controller;
import modele.I_modeleGrille;
import vue.GrilleGraphique;
import vue.I_Grille;

public class ControllerGrille implements  I_Controller {

  private  I_modeleGrille model ;
  private  I_Grille grille ;

  public ControllerGrille(I_modeleGrille modele){
      this.model = modele ;
      this.grille = new GrilleGraphique(this,modele);

  }
    @Override
    public void ajouterMotHoriz(String s, int x, int y) {
      boolean resultat = model.ajouterMotHoriz(s,x,y);
      if(resultat == false){
          grille.sendMessage(String.format("Ajout de %s en (%d, %d) impossible", s, x, y));

      }
    }
}
