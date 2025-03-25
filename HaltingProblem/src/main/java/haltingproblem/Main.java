package haltingproblem;

import haltingproblem.maquinas.Reverser;
import haltingproblem.programas.Programa;
import haltingproblem.factories.ProgramaFactory;
import haltingproblem.factories.ProgramaFinitoFactory;
import haltingproblem.factories.ProgramaInfinitoFactory ;

public class Main {
    public static void main(String[] args) {
        
        /*
        Programa finito = new ProgramaFinito(5);
        Programa infinito = new ProgramaInfinito(1);
        */

        ProgramaFactory finitoFactoria = new ProgramaFinitoFactory();
        ProgramaFactory infinitoFactoria = new ProgramaInfinitoFactory();

        Programa finito =  finitoFactoria.crearPrograma(3);
        Programa infinito =  infinitoFactoria.crearPrograma(0);

        System.out.println("Probando programa finito:");
        finito.execute();

        System.out.println("\nProbando programa infinito:");
        // countUp.execute(); // Descomentar para probar bucle infinito

        System.out.println("\nProbando Reverser con programa finito:");
        // Reverser.execute(finito); // Descomentar para probar bucle infinito

        System.out.println("\nProbando Reverser con programa infinito:");
        Reverser.execute(infinito);
    }
}