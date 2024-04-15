import fr.limayrac.obs_pattern. Observer;

public class PenduleUK implements Observer {
    private String nom = this.getClass().getSimpleName();
    @Override
    public void update (String currentHour) {
        System.out.printf("%s: now it is %s%n", nom, currentHour);
    }
}