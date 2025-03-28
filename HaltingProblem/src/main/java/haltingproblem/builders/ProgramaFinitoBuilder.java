package haltingproblem.builders;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;

public class ProgramaFinitoBuilder implements ProgramaBuilder {
    private int num;

    @Override
    public void reset() {
        this.num = 0;
    }

    @Override
    public Programa build(int num) {
        return new ProgramaFinito(num);
    }
}
