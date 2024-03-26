import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactureTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        // Test add from Facture
        Facture facture = new Facture(1);
        Article article1 = new Article("Article 1", 1, 10.0);
        Article article2 = new Article("Article 2", 2, 20.0);
        try {
            facture.add(article1);
            facture.add(article2);
            facture.valide();
        } catch (FactureException e) {
            e.printStackTrace();
        }
    }

    @Test
    void valide() {
        // Test valide from Facture
        Facture facture = new Facture(1);
        Article article1 = new Article("Article 1", 1, 10.0);
        try {
            facture.add(article1);
            facture.valide();
            if (!facture.getIsValidee()) {
                fail("Facture should be valid");
            }
        } catch (FactureException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getTotal() {
    }

    @Test
    void countArticles() {
    }

    @Test
    void isValide() {
    }
}