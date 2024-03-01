public class Main {
    public static void main(String[] args) {

        int i = 5;

        i = 0;
        System.out.println("boucle 1");
        while ( i > 0 ) {
            System.out.println( "Test");
            // i++;
            i--;
        }

        System.out.println("boucle 2");
        while ( i > 0 ) {
            System.out.println( "Test");
            // i++;
            i--;
        }

        System.out.println("boucle 3");
        for (i = 1; i != 5; i+=2) {
            System.out.println( "Test");
        }

        System.out.println("boucle 4");
        // for (i = 1; 5 != 0; i++) {
        for (i = 1; i != 5; i--) {
            System.out.println( "Test");
        }

        System.out.println("boucle 5");
        i = 5;
        while ( i < 100 ) {
            System.out.println( "i = " + i);
            // i++;
            i--;
        }
    }
}