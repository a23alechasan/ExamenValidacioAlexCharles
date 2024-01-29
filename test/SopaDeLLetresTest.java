import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SopaDeLLetresTest {
    static String cadena = "";

    @BeforeEach
    void setUp() {
        SopaDeLLetres.matriu = new char[10][10];
        char lletra = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                SopaDeLLetres.matriu[i][j] = lletra;
                cadena += lletra;
                lletra++;
                if (lletra > 'Z')
                    lletra = 'A';
            }
        }
    }


    @Test
    void crearSopaDeLletresRecursiuTest(){
        assertEquals('A', crearSopaDeLletresRecursiuTest(SopaDeLLetres.matriu, cadena, 0, 0));
        assertEquals('C', crearSopaDeLletresRecursiuTest(SopaDeLLetres.matriu, cadena, 0, 3));
        assertNotEquals('R', crearSopaDeLletresRecursiuTest(SopaDeLLetres.matriu, cadena, 0, 4));
        assertNotEquals('A', crearSopaDeLletresRecursiuTest(SopaDeLLetres.matriu, cadena, 1, 5));
    }
}