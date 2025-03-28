package haltingproblem.builders;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaInfinito;

public class ProgramaInfinitoBuilder implements ProgramaBuilder {
    private int num;

    @Override
    public void reset() {
        this.num = 0;
    }

    @Override
    public Programa build(int num) {
        return new ProgramaInfinito(num);
    }
}
