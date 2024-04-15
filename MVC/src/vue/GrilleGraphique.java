package vue;

import controller.I_Controller;
import modele.GrilleVirtuelle;
import modele.I_modeleGrille;
import observer.I_Observateur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GrilleGraphique extends JFrame implements I_Observateur, I_Grille, ActionListener, MouseListener {
    private int largeur = 3;
    private int hauteur = 3;
    private final int TAILLECASE = 100;
    private ArrayList<JLabel> tableau = new ArrayList<>();

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem addTestMenuItem;
    private JMenuItem addEssaiMenuItemOK;
    private JMenuItem addEssaiMenuItemKO;
    private I_Controller controller;
    private I_modeleGrille modele;

    public GrilleGraphique(I_Controller ctrl, I_modeleGrille modele) throws HeadlessException {
        this.controller = ctrl;
        this.modele = modele;
        modele.addObservateur(this);
        this.largeur = modele.getLargeur();
        this.hauteur = modele.getHauteur();
        System.out.printf("création d'une grille %s x %s%n", this.largeur, this.hauteur);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(largeur * TAILLECASE, hauteur * TAILLECASE));
        setLocation(100, 200);
        setResizable(false);
        GridLayout layout = new GridLayout(hauteur, largeur);
        setLayout(layout);
        createControls();
        buildGrilleChiffres();
        setVisible(true);
        pack();
    }

    private void createControls() {
        menuBar = new JMenuBar();
        menu = new JMenu("actions");
        addTestMenuItem = new JMenuItem("ajouter test en 0,0");
        menu.add(addTestMenuItem);
        addTestMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                controller.ajouterMotHoriz("test", 0, 0);
            }
        });
        addEssaiMenuItemOK = new JMenuItem("ajouter essai en 5,4 (ok)");
        menu.add(addEssaiMenuItemOK);
        addEssaiMenuItemOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                controller.ajouterMotHoriz("essai", 5, 4);
            }
        });

        addEssaiMenuItemKO = new JMenuItem("ajouter essai en 6,4 (ko)");
        menu.add(addEssaiMenuItemKO);
        addEssaiMenuItemKO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                controller.ajouterMotHoriz("essai", 6, 4);
            }
        });

        JMenuItem exit = new JMenuItem("Quitter");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        menu.add(exit);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    private void buildGrilleChiffres() {
        for (int i = 1; i < hauteur * largeur; i++) {
            JLabel j1 = j1(".", new Color((100 + (i * 40)) % 255, (200 + (i * 40)) % 255, (i * 40) % 255));
            j1.addMouseListener(this);
            tableau.add(j1);
            add(j1);
        }
    }

    private JLabel j1(String lettre, Color c) {
        JLabel label = new JLabel(lettre);
        label.setOpaque(true);
        label.setBackground(c);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, TAILLECASE / 2));
        return label;
    }

    @Override
    public void update(GrilleVirtuelle gv) {
        for (int i = 1; i <= hauteur * largeur; i++) {

        }

        char[][] tab = gv.getTableauDeCases();
        for (int h = 0; h < hauteur; h++) {
            for (int l = 0; l < largeur; l++) {
                tableau.get(h * largeur + l).setText(String.valueOf(tab[l][h]));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        //TODO Auto-generated method stub
    }

    @Override
    public void sendMessage(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        if (arg0.getSource() instanceof JLabel) {
            System.out.println(arg0.getSource().toString());
            JLabel j = (JLabel)arg0.getSource();
            System.out.println(j.getText());
        }
    }

    @Override
    public void mouseEntered(MouseEvent arg0) { // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent arg0) { // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent arg0) { // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent arg0) { // TODO Auto-generated method stub
    }
}
