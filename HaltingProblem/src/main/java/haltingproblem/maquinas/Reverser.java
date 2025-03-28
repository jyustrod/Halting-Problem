package haltingproblem.maquinas;

import haltingproblem.programas.Programa;

public class Reverser implements Programa {

    @Override
    public void execute() {
        execute(this);
    }

    public static void execute(Programa programa) {
        if (HaltChecker.sePara(programa)) {
            while (true) {
                System.out.println("El reverser esta ejecutandose infinitamente.");
            }
        } else {
            System.out.println("El reverser ha parado.");
        }
    }
    @Override
    public int getNum() {
        throw new UnsupportedOperationException("Reverser no usa números.");
    }
}
