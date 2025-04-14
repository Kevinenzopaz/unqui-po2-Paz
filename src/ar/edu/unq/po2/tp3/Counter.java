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
    
    //Punto 2
    
    public int numeroConMasDigitosPares(int[] numeros) {
        int maxCantidad = -1;
        int numeroResultado = 0;

        for (int numero : numeros) {
            int cantidad = contarDigitosPares(Math.abs(numero)); // por si hay negativos
            if (cantidad > maxCantidad) {
                maxCantidad = cantidad;
                numeroResultado = numero;
            }
        }

        return numeroResultado;
    }
    
    // Cuenta la cantidad de dígitos pares en un número
    public int contarDigitosPares(int numero) {
        int contador = 0;

        if (numero == 0) return 1; // caso especial: 0 es un dígito par

        while (numero > 0) {
            int digito = numero % 10; // extrae el último dígito
            if (digito % 2 == 0) {
                contador++;
            }
            numero = numero / 10; // quita el último dígito
        }

        return contador;
    }
    
    //punto 3
    public int mayorMultiploComúnHasta1000(int x, int y) {
        for (int i = 1000; i >= 0; i--) { //for(inicializacion, condicion, actualizacion)
            if (i % x == 0 && i % y == 0) { //si es multiplo de "x" y multiplo de "y" 
                return i;
            }
        }
        return -1; // No se encontró ningún múltiplo común
    }
  //Punto 4
	
  	String a = "abc";
  	
  	String s = a;
  	
  	String t;

  	
  	public int pruebaDeStringsUno() {
  		return s.length();
  	}
  	//El valor que da es 3 y esta bien porque el string tiene 3 caracteres
  	
  	
  	
  	public int pruebaDeStringsDos() {
  		return t.length();
  	}
  	//Da error porque la variable "t no tiene ningun valor asignado
  	
  	
  	
  	public String pruebaDeStringsTres() {
  		return 1 + a;
  	}
  	//Se concatena el numero con el string y queda "1abc" es decir, el int se transforma en String
  	
  	public String pruebaDeStringsCuatro() {
  		return a.toUpperCase();
  	}
  	//Se envia un mensaje para convertir cada caracter en mayuscula
  	
  	public int pruebaDeStringsCinco() {
  		return "Libertad".indexOf("r");
  	}
  	//Devuelve la posicion del caracter en el string(es 4 porque empieza desde cero)
  	
  	public int pruebaDeStringsSeis() {
  		return "Universidad".lastIndexOf("i");
  	}
  	//Devuelve la posicion del la ultima aparicion del string dado
  	
  	public String pruebaDeStringsSiete() {
  		return "Quilmes".substring(2,4);
  	}
  	//Devuelve un substring del string dado. No incluye el ultimo valor del rango a substraer 
  	// "Quilmes" --> "il" con un rango de (2,4)
  	
  	public boolean pruebaDeStringsOcho() {
  		return (a.length() + a).startsWith("a");
  	}
  	//Como el resultado es 3a, el metodo devuelve false
  	
  	public boolean pruebaDeStringsNueve() {
  		return s == a;
  	}
  	//"s" es equivalente a "a"
  	
  	public boolean pruebaDeStringsDiez() {
  		return a.substring(1,3).equals("bc");
  	}
  	// la cadena substraida de a es "bc" (la posicion 3 no se toma)
  	
  //Punto 5
	
  	/*
  	 *Pregunta 1)
  	 *	*Son los tipos de datos que ya estan definidos en el lenguaje
  	 *Pregunta 2)
  	 *	*El int es un tipo primitivo e Integer es una clase Wrapper
  	 *Pregunta 3)
  	 *	El valor predeterminado de un int es cero
  	 *	El valor predeterminado de un Integer es null
  	 *Pregunta 4)
  	 *	Se deben inicializar. No tienen valor predeterminado.
  	 */
  	
  	

}