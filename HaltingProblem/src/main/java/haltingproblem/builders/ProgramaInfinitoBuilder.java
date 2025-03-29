package haltingproblem.builders;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaInfinito;

public class ProgramaInfinitoBuilder implements ProgramaBuilder {
    private Programa subPrograma;

    @Override
    public void reset() {
        this.subPrograma = null;
    }

    @Override
    public Programa build(Programa subPrograma) {
        return new ProgramaInfinito(subPrograma);
    }
}
