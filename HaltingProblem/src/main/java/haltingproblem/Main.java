package haltingproblem;

import haltingproblem.builders.Director;
import haltingproblem.builders.ProgramaFinitoBuilder;
import haltingproblem.builders.ProgramaInfinitoBuilder;
import haltingproblem.maquinas.HaltChecker;
import haltingproblem.maquinas.MaquinaX;
import haltingproblem.programas.*;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new ProgramaFinitoBuilder());
        Programa finito = director.construirPrograma(50, null);

        System.out.println("Probando programa finito:");
        if (HaltChecker.sePara(finito)) {
            System.out.println("El programa ha terminado.");
        } else {
            System.out.println("El programa no ha terminado a tiempo.");
        }

        director.cambiarBuilder(new ProgramaInfinitoBuilder());
        Programa infinito = director.construirPrograma(1, null);

        System.out.println("\nProbando programa infinito:");
        if (HaltChecker.sePara(infinito)) {
            System.out.println("El programa ha terminado.");
        } else {
            System.out.println("El programa no ha terminado a tiempo");
        }

        System.out.println("\nProbando MaquinaX con programa finito:");
        MaquinaX maquinaXFinita = new MaquinaX(finito);
        maquinaXFinita.execute();

        System.out.println("\nProbando MaquinaX con programa infinito:");
        MaquinaX maquinaXInfinita = new MaquinaX(infinito);
        maquinaXInfinita.execute();

        System.out.println("\nProbando MaquinaX con MaquinaX (esto genera la paradoja):");
        MaquinaX paradoja = new MaquinaX(new MaquinaX(new MaquinaX(null)));
        paradoja.execute();
    }
}