public class Triplet<T> {
    private T premier;
    private T deuxieme;
    private T troisieme;

    public Triplet(T premier, T deuxieme, T troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public void setPremier(T val) {
        this.premier = val;
    }

    public void setDeuxieme(T val) {
        this.deuxieme = val;
    }

    public void setTroisieme(T val) {
        this.troisieme = val;
    }

    void affiche() {
        System.out.println("Premier : " + premier);
        System.out.println("Deuxieme : " + deuxieme);
        System.out.println("Troisieme : " + troisieme);
    }
}