package haltingproblem;

import haltingproblem.maquinas.HaltChecker;
import haltingproblem.maquinas.Reverser;
import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;
import haltingproblem.programas.ProgramaInfinito;
import haltingproblem.prototype.RegistroProgramas;
import haltingproblem.prototype.ProgramaPrototype;

public class Main {
    public static void main(String[] args) {

        RegistroProgramas registro = new RegistroProgramas();

        ProgramaPrototype finitoPrototipo = new ProgramaFinito(5);
        ProgramaPrototype infinitoPrototipo = new ProgramaInfinito(1);

        registro.addPrograma("finito", finitoPrototipo);
        registro.addPrograma("infinito", infinitoPrototipo);

        Programa finito = registro.getPrograma("finito");
        Programa infinito = registro.getPrograma("infinito");

        System.out.println("Probando programa finito:");
        if (HaltChecker.sePara(finito)) {
            System.out.println("El programa ha terminado.");
        } else {
            System.out.println("El programa no ha terminado a tiempo.");
        }

        System.out.println("\nProbando programa infinito:");
        if (HaltChecker.sePara(infinito)) {
            System.out.println("El programa ha terminado.");
        } else {
            System.out.println("El programa no ha terminado a tiempo.");
        }

        System.out.println("\nProbando Reverser con programa finito:");
        // Reverser.execute(finito);

        System.out.println("\nProbando Reverser con programa infinito:");
        // Reverser.execute(infinito);
    }
}