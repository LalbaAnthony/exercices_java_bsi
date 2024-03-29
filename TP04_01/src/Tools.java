public class Tools {
    public static void   afficheEtudiants(Etudiant[] etudiants) {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.toString());
        }
    }
}