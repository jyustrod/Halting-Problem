package haltingproblem.maquinas;

import haltingproblem.programas.Programa;

public class MaquinaX implements Programa {
    private Programa subPrograma;

    public MaquinaX(Programa programa) {
        this.subPrograma = programa;
    }

    @Override
    public void execute() {
        Reverser.execute(this);
    }

    @Override
    public Programa getSubPrograma() {
        return subPrograma;
    }
}
