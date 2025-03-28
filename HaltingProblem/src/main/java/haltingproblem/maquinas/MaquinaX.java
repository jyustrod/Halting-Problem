package haltingproblem.maquinas;

import haltingproblem.programas.Programa;

public class MaquinaX implements Programa {
    private Programa programa;

    public MaquinaX(Programa programa) {
        this.programa = programa;
    }

    @Override
    public void execute() {
        if (HaltChecker.sePara(new MaquinaX(programa))) {
            while (true) {
                System.out.println("MaquinaX ejecutándose infinitamente.");
            }
        } else {
            System.out.println("MaquinaX ha parado.");
        }
    }

    @Override
    public int getNum() {
        throw new UnsupportedOperationException("MaquinaX no usa números.");
    }

    @Override
    public Programa getSubPrograma() {
        return programa;
    }
}
