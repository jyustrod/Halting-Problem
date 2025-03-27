package haltingproblem;

import haltingproblem.builders.Director;
import haltingproblem.builders.ProgramaBuilder;
import haltingproblem.builders.ProgramaFinitoBuilder;
import haltingproblem.builders.ProgramaInfinitoBuilder;
import haltingproblem.maquinas.HaltChecker;
import haltingproblem.maquinas.Reverser;
import haltingproblem.programas.*;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new ProgramaFinitoBuilder());
        Programa finito = director.construirPrograma(50);

        System.out.println("Probando programa finito:");
        if (HaltChecker.sePara(finito)) {
            System.out.println("El programa ha terminado.");
        } else {
            System.out.println("El programa no ha terminado a tiempo.");
        }

        director.cambiarBuilder(new ProgramaInfinitoBuilder());
        Programa infinito = director.construirPrograma(1);

        System.out.println("\nProbando programa infinito:");
        if (HaltChecker.sePara(infinito)) {
            System.out.println("El programa ha terminado.");
        } else {
            System.out.println("El programa no ha terminado a tiempo");
        }

        System.out.println("\nProbando Reverser con programa finito:");
        // Reverser.execute(finito); // Descomentar para probar bucle infinito

        System.out.println("\nProbando Reverser con programa infinito:");
        Reverser.execute(infinito);
    }
}
