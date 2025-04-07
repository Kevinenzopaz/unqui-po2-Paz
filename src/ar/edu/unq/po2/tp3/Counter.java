package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

//Punto 1)


public class Counter {
    private List<Integer> numbers = new ArrayList<>();

    // Método para agregar un número a la lista
    public void addNumber(int number) {
        numbers.add(number);
    }

    // Cuenta la cantidad de números pares
    public int cantidadDePares() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    // Cuenta la cantidad de números impares
    public int cantidadDeImpares() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    // Cuenta la cantidad de múltiplos de un número dado
    public int cantidadDeMultiplosDe(int value) {
        int count = 0;
        for (int number : numbers) {
            if (number % value == 0) {
                count++;
            }
        }
        return count;
    }
    
}