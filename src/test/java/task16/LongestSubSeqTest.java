package task16;

import org.example.task16.LongestSubSeq;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LongestSubSeqTest {

    private LongestSubSeq testInstance;

    @BeforeAll
    public void setup() {
        this.testInstance = new LongestSubSeq();
    }

    @Test
    public void testNumereConsecutive() {
        int[] numere = {1, 2, 3, 4, 5};
        int rezultatActual = this.testInstance.calculeazaLungimeaMaxSubSeq(5, numere);
        assertEquals(5, rezultatActual);
    }

    @Test
    public void testNumereMixte() {
        int[] numere = {10, 20, 10, 30, 40, 10};
        int rezultatActual = this.testInstance.calculeazaLungimeaMaxSubSeq(6, numere);
        assertEquals(3, rezultatActual);
    }

    @Test
    public void testNumereEgale() {
        int[] numere = {5, 5, 5, 5, 5};
        int rezultatActual = this.testInstance.calculeazaLungimeaMaxSubSeq(5, numere);
        assertEquals(1, rezultatActual);
    }

    @Test
    public void testNumarSingular() {
        int[] numere = {22};
        int rezultatActual = this.testInstance.calculeazaLungimeaMaxSubSeq(1, numere);
        assertEquals(
                1,
                rezultatActual
        );
    }

    @Test
    public void testException() {
        int[] numere = {1, 2, 3, 4};
        assertThrows(
                InputMismatchException.class,
                () -> this.testInstance.calculeazaLungimeaMaxSubSeq(2, numere)  // expresie lambda neparametrizata
                // calculam rezultatul actual direct in expresia lambda
        );
    }

    @Test
    public void testMultipleAssertions() {
        int[] numere = {3, 4, 1, 2, 3, 0, 1};
        int rezultatActual = this.testInstance.calculeazaLungimeaMaxSubSeq(numere.length, numere);

        assertAll(
                "Verificari multiple pt secventa " + numere,
                () -> assertEquals(3, rezultatActual),
                () -> assertTrue(rezultatActual > 0),
                () -> assertNotEquals(0, rezultatActual),
                () -> assertFalse(rezultatActual < 0)
        );
    }
}
