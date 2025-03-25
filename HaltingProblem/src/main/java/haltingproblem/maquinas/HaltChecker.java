package haltingproblem.maquinas;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;
import haltingproblem.programas.ProgramaInfinito;

public class HaltChecker {
    public static boolean sePara(Programa programa) {
        if (programa instanceof ProgramaFinito) {
            return true;
        } else if (programa instanceof ProgramaInfinito) {
            return false;
        }
        return false;
    }
}
