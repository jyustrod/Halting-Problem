package haltingproblem.builders;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;

public class ProgramaFinitoBuilder implements ProgramaBuilder {
    private int num;
    private Programa subPrograma;

    @Override
    public void reset() {
        this.num = 0;
        this.subPrograma = null;
    }

    @Override
    public Programa build(int num, Programa subPrograma) {
        return new ProgramaFinito(num, subPrograma);
    }
}
