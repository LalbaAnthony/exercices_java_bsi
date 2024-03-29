class Couple<T> {
    private T x, y;

    public Couple(T premier, T second) {
        x = premier;
        y = second;
    }

    public void affiche() {
        System.out.println("premiere valeur : " + x
                + " - deuxieme valeur : " + y);
    }
}