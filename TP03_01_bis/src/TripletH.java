import java.util.Random;

public class TripletH<T1, T2, T3> {
    private T1 premier;
    private T2 deuxieme;
    private T3 troisieme;

    public TripletH(T1 premier, T2 deuxieme, T3 troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public void setPremier(T1 val) {
        this.premier = val;
    }

    public void setDeuxieme(T2 val) {
        this.deuxieme = val;
    }

    public void setTroisieme(T3 val) {
        this.troisieme = val;
    }

    void affiche() {
        System.out.println("Premier : " + premier);
        System.out.println("Deuxieme : " + deuxieme);
        System.out.println("Troisieme : " + troisieme);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> T pickRandomItem(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(array.length);

        return array[randomIndex];
    }
}