import fr.limayrac.obs_pattern.Observable;
import fr.limayrac.obs_pattern.Observer;

public class Main {
    public static void main(String args[]) {
        TimeBroadcast temps = new TimeBroadcast();
        Observer penduleFr = new PenduleFrance();
        Observer penduleUK = new PenduleUK();
        Observer penduleFrFrame = new PenduleFranceFrame();
        temps.ajouterObservateur(penduleFr);
        temps.ajouterObservateur(penduleUK);
        temps.ajouterObservateur(penduleFrFrame);
        temps.start();
    }
}