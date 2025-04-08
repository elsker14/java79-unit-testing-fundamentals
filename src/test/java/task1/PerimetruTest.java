package task1;

import org.example.task1.Perimetru;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimetruTest {

    /* Testul functional - verifica un happy flow comun */
    @Test
    public void testPerimetruHappyFlow() {
        Perimetru perimetru = new Perimetru();

        // se poate defini diametru ca variabila globala a metodei de test
        // astfel incat sa fie pasat la definirea celor 2 variabile de rezultat

        double rezultatActual = perimetru.calculeazaPerimetru(2.0);
        double rezultatAsteptat = 2.0 * Math.PI;

        assertEquals(rezultatAsteptat, rezultatActual, 0.0001);
    }

    /* Boundary Test -> verifica valori in zona lui 0, empty sau null */
    @Test
    public void testPerimetruZero() {
        Perimetru perimetru = new Perimetru();

        double rezultatActual = perimetru.calculeazaPerimetru(0.0);

        assertEquals(0.0, rezultatActual, 0.0001);
    }

    /* Negative Test -> verifica valori in zona numerelor negative */
    @Test
    public void testPerimetruNumarNegative() {
        Perimetru perimetru = new Perimetru();

        double rezultatActual = perimetru.calculeazaPerimetru(-2.0);

        assertEquals(-2.0 * Math.PI, rezultatActual, 0.0001);
    }

    /* Precision Test -> verifica valori fractionare */
    @Test
    public void testPerimetruPrecizie() {
        Perimetru perimetru = new Perimetru();

        double rezultatActual = perimetru.calculeazaPerimetru(1.5);

        assertEquals(4.71239, rezultatActual, 0.0001);
    }

    /* Scaling Test -> verifica valori intr-o plaja de multiplicari */
    @Test
    public void testPerimetruScalat() {
        Perimetru perimetru = new Perimetru();

        double diametru1 = 5.0;
        double diametru2 = 2 * diametru1;

        double rezultatAsteptatP1 = perimetru.calculeazaPerimetru(diametru1);
        double rezultatAsteptatP2 = perimetru.calculeazaPerimetru(diametru2);

        assertEquals(rezultatAsteptatP1 * 2, rezultatAsteptatP2, 0.0001);
    }
}
