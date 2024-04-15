import fr.limayrac.obs_pattern.Observer;
import java.text.SimpleDateFormat;

public class PenduleFrance implements Observer {
    private String nom = this.getClass().getSimpleName();

    @Override
    public void update(String heureCourante) {
        System.out.printf("%s: il est %s%n", nom, heureCourante);
    }
}