package haltingproblem.maquinas;

import haltingproblem.programas.Programa;

public class Reverser {
    public static void execute(Programa programa) {
        if (HaltChecker.sePara(programa)) {
            while (true) {
                System.out.println("El reverser esta ejecutandose infinitamente.");
            }
        } else {
            System.out.println("El reverser ha parado.");
        }
    }
}
