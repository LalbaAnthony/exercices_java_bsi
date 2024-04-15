package fr.limayrac.obs_pattern;

public interface Observable {
    void ajouterObservateur(Observer obs);
    void supprimerObservateur(Observer obs);
    void notifierObservateurs();
}
