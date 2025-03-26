package haltingproblem;

import haltingproblem.builders.Director;
import haltingproblem.builders.ProgramaConcreteBuilder;
import haltingproblem.programas.Programa;

public class Main {
    public static void main(String[] args) {
        ProgramaConcreteBuilder builder = new ProgramaConcreteBuilder();
        Director director = new Director(builder);

        System.out.println("Creando un programa finito:");
        director.make("finito", 5);
        Programa finito = director.getPrograma();
        finito.execute();

        System.out.println("\nCreando un programa infinito:");
        director.make("infinito", 1);
        Programa infinito = director.getPrograma();
        // infinito.execute(); // Descomentar para probar bucle infinito
    }
}