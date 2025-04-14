package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import java.time.Period;

class EquipoDeTrabajoTestCase {

	private EquipoDeTrabajo equipo;

    @BeforeEach
    public void setUp() {
        equipo = new EquipoDeTrabajo("Team Java");

        // Instanciamos 5 personas con distintas fechas de nacimiento
        Persona p1 = new Persona("Lucía", LocalDate.of(2000, 5, 10));
        Persona p2 = new Persona("Carlos", LocalDate.of(1995, 2, 28));
        Persona p3 = new Persona("María", LocalDate.of(1990, 11, 12));
        Persona p4 = new Persona("Julián", LocalDate.of(1985, 8, 23));
        Persona p5 = new Persona("Valeria", LocalDate.of(1998, 3, 5));

        equipo.agregarIntegrante(p1);
        equipo.agregarIntegrante(p2);
        equipo.agregarIntegrante(p3);
        equipo.agregarIntegrante(p4);
        equipo.agregarIntegrante(p5);
    }

    @Test
    public void testPromedioEdadDelEquipo() {
        double promedio = equipo.promedioEdad();

        // Cálculo esperado dinámico (por si el test se ejecuta en el futuro)
          int sumaEdades = equipo.getIntegrantes()
                                 .stream() //Convierte la lista en una secuencia de elementos para poder hacer operaciones funcionales como map, filter, sum, etc
                                 .mapToInt(Persona::getEdad) //Transforma cada Persona del stream en su edad (un int).
                                 .sum();equipo.getIntegrantes(); //Suma todos los valores del IntStream.sum();
          
        //Una manera mas convencional poniendo las fechas a mano:
        //int sumaEdades = Period.between(LocalDate.of(2000, 5, 10), LocalDate.now()).getYears()
        //                + Period.between(LocalDate.of(1995, 2, 28), LocalDate.now()).getYears()
        //                + Period.between(LocalDate.of(1990, 11, 12), LocalDate.now()).getYears()
        //                + Period.between(LocalDate.of(1985, 8, 23), LocalDate.now()).getYears()
        //                + Period.between(LocalDate.of(1998, 3, 5), LocalDate.now()).getYears();

        double promedioEsperado = (double) sumaEdades / equipo.getIntegrantes().size();

        // Comparación con tolerancia (por si hay decimales)
        assertEquals(promedioEsperado, promedio, 0.01);
    }
}


