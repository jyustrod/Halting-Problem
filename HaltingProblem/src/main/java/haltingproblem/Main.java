package haltingproblem;

import haltingproblem.maquinas.Reverser;
import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;
import haltingproblem.programas.ProgramaInfinito;

public class Main {
    public static void main(String[] args) {
        Programa finito = new ProgramaFinito(5);
        Programa infinito = new ProgramaInfinito(1);

        Programa clonFinito = finito.clone();
        Programa clonInfinito = infinito.clone();

        System.out.println("Probando programa finito clonado:");
        clonFinito.execute();

        System.out.println("\nProbando Reverser con programa infinito clonado:");
        // Reverser.execute(clonInfinito); // Descomentar para probar bucle infinito
    }
}
