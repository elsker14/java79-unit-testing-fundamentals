package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    // before all seamana foarte mult cu initializarea unei instante de obiect
    // de tipul SINGLETON (design pattern)
    private static Calculator calculator;

    @BeforeAll  // functioneaza la nivel static de clasa
    public static void setup() {
        System.out.println("S-a intrat in hook-ul de before all...");

        calculator = new Calculator();
    }

    @AfterEach
    public void cleanup() {
        System.out.println("S-a intrat in hook-ul de after each...");
    }

    // Adunarea ar trebui sa fie corecta pt numere intregi
    @Test
    public void testAdunare() {
        System.out.println("S-a intrat in testul pt verificarea adunarii!");
        double rezultatActual = calculator.adunare(4, 5);
        // definiti rezultatul actual asteptat -> double rezultatAsteptat = 9;
        assertEquals(9, rezultatActual); // assert(expected, actual);
    }

    @Test
    public void testScadere() {
        double rezultatActual = calculator.scadere(4, 5);
        assertEquals(-1, rezultatActual);
    }
}
