package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CounterTestCase {
private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
@BeforeEach
public void setUp() throws Exception {
//Se crea el contador
counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
counter.addNumber(1);
counter.addNumber(3);
counter.addNumber(5);
counter.addNumber(7);
counter.addNumber(9);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(4);
}
/**
* Verifica la cantidad de pares
*/
@Test
public void testEvenNumbers() {
// Getting the even occurrences
int amount = counter.cantidadDePares();
// I check the amount is the expected one
assertEquals(1, amount);
}

/**
 * Verifica la cantidad de impares
 */
@Test
public void testOddNumbers() {
    int amount = counter.cantidadDeImpares();
    assertEquals(9, amount);
}

/**
 * Verifica la cantidad de múltiplos de 3
 */
@Test
public void testMultiplesOfThree() {
    int amount = counter.cantidadDeMultiplosDe(3);
    assertEquals(2, amount); // 3 y 9 son los únicos múltiplos de 3
}

}









