import static org.junit.jupiter.api.Assertions.*;

class FactureTest {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test

    void testAdd() {
        Facture f = new Facture(1);
        Article a1 = new Article("stylo", 2, 1.5);
        Article a2 = new Article("cahier", 1, 2.5);
        Article a3 = new Article("gomme", 3, 0.5);
        f.add(a1);
        f.add(a2);
        f.add(a3);
        assertEquals(3, f.countArticles());
    }
}