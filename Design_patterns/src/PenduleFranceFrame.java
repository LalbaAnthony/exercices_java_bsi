import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import fr.limayrac.obs_pattern.Observer;

public class PenduleFranceFrame extends JFrame implements Observer {
    private String nom = this.getClass().getSimpleName();
    private JLabel label;

    public PenduleFranceFrame() {
        setSize(200, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        label = new JLabel("heure");
        Font f = new Font("Arial", Font.BOLD, 20);
        label.setForeground(Color.blue);
        label.setFont(f);
        panel.add(label);
        add(panel);
        setSize(200, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void update(String heureCourante) {
        String strPattern = "\\d{2}:\\d{2}:\\d{2}";
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(heureCourante);
        if (matcher.find()) {
            label.setText("heure: " + matcher.group());
        }
    }
}
