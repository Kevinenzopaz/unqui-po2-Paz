package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
	
    // Suma todos los elementos de la lista
    public int sumar(List<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    // Resta todos los elementos de la lista: n1 - n2 - n3 - ...
    public int restar(List<Integer> numeros) {
        if (numeros.isEmpty()) return 0;

        int resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resultado -= numeros.get(i);
        }
        return resultado;
    }

    // Multiplica todos los elementos de la lista
    public int multiplicar(List<Integer> numeros) {
        if (numeros.isEmpty()) return 0;

        int producto = 1;
        for (int numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

}
