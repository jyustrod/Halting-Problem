package haltingproblem;

import haltingproblem.maquinas.Reverser;
import haltingproblem.programas.ProgramaFinito;
import haltingproblem.programas.ProgramaInfinito;
import haltingproblem.prototype.ProgramaPrototype;

public class Main {
    public static void main(String[] args) {
        ProgramaPrototype finito = new ProgramaFinito(5);
        ProgramaPrototype infinito = new ProgramaInfinito(1);

        ProgramaPrototype clonFinito = finito.clone();
        ProgramaPrototype clonInfinito = infinito.clone();

        System.out.println("Probando programa finito clonado:");
        clonFinito.execute();

        System.out.println("\nProbando Reverser con programa infinito clonado:");
        Reverser.execute(clonInfinito);
    }
}
