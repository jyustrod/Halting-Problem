package haltingproblem.builders;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;
import haltingproblem.programas.ProgramaInfinito;

public class ProgramaConcreteBuilder implements ProgramaBuilder {
    private Programa programa;

    @Override
    public void reset() {
        this.programa = null;
    }

    @Override
    public void setTipoFinito(int num) {
        this.programa = new ProgramaFinito(num);
    }

    @Override
    public void setTipoInfinito(int num) {
        this.programa = new ProgramaInfinito(num);
    }

    @Override
    public Programa getResult() {
        return this.programa;
    }
}