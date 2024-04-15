import java.time.LocalDateTime;
import java.util.*;
import fr.limayrac.obs_pattern.Observable;
import fr.limayrac.obs_pattern.Observer;

public class TimeBroadcast extends Thread implements Observable {
    Collection<Observer> lesObserveurs = new ArrayList<>();
    private String heureCourante;

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                sleep(1000);
                heureCourante = LocalDateTime.now().toString();
                notifierObservateurs();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void ajouterObservateur(Observer obs) {
        lesObserveurs.add(obs);
        System.out.printf("l'observateur %s vient de s'abonner %n", obs.getClass().getSimpleName());
    }

    @Override
    public void supprimerObservateur(Observer obs) {
        lesObserveurs.remove(obs);
        System.out.printf("l'observateur %s vient de se désabonner %n", obs.getClass().getSimpleName());
    }

    @Override
    public void notifierObservateurs() {
        for (Observer obs : lesObserveurs) {
            obs.update(this.heureCourante);
        }
    }
}

