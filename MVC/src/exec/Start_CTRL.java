package exec;

import controller.ControllerGrille;
import modele.I_modeleGrille;
import modele.GrilleVirtuelle;
import controller.I_Controller;

public interface Start_CTRL {
    public static void main(String[] args) {
        I_modeleGrille gv = new GrilleVirtuelle(5,10);
        I_Controller ctrl = new ControllerGrille(gv);
    }
}
