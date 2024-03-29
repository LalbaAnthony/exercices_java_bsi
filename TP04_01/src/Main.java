public class Main {
    public static void main(String[] args) {
        // Fill the array with 3 students
        Etudiant[] etudiants = new Etudiant[3];
        etudiants[0] = new Etudiant(1, "Doe", "John", 12.5);
        etudiants[1] = new Etudiant(2, "Doe", "Jane", 11.5);
        etudiants[2] = new Etudiant(3, "Doe", "Alice", 16.5);
        
        // Display the array
        Tools.afficheEtudiants(etudiants);
        
        // Sort by moyenne with compareTo
        System.out.println("Sort by moyenne with compareTo");
        for (int i = 0; i < etudiants.length; i++) {
            for (int j = i + 1; j < etudiants.length; j++) {
                if (etudiants[i].compareTo(etudiants[j], "moyenne", "asc") > 0) {
                    Etudiant temp = etudiants[i];
                    etudiants[i] = etudiants[j];
                    etudiants[j] = temp;
                }
            }
        }

        // Display the array
        Tools.afficheEtudiants(etudiants);

        // Sort by nom with compareTo
        System.out.println("Sort by nom with compareTo");
        for (int i = 0; i < etudiants.length; i++) {
            for (int j = i + 1; j < etudiants.length; j++) {
                if (etudiants[i].compareTo(etudiants[j], "nom", "asc") > 0) {
                    Etudiant temp = etudiants[i];
                    etudiants[i] = etudiants[j];
                    etudiants[j] = temp;
                }
            }
        }

        // Display the array
        Tools.afficheEtudiants(etudiants);
    }
}