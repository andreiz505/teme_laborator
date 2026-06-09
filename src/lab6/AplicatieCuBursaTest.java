package lab6;

import lab5.StudentBursier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AplicatieCuBursaTest {

    @Test
    public void testCreareStudentBursier() {
        StudentBursier sb = new StudentBursier(1050, "Mihai", "Dobre", "TI131", 9.50, 800.0);

        // Verificam daca datele au fost setate corect
        assertEquals(1050, sb.getNumarMatricol());
        assertEquals(800.0, sb.getCuantumBursa());
        assertNotNull(sb.getNume());
    }

    @Test
    public void testEgalitateBursieri() {
        StudentBursier sb1 = new StudentBursier(1050, "Mihai", "Dobre", "TI131", 9.50, 800.0);
        StudentBursier sb2 = new StudentBursier(1050, "Mihai", "Dobre", "TI131", 9.50, 800.0);

        assertTrue(sb1.equals(sb2));
    }
}