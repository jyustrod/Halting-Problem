package haltingproblem.builders;

import haltingproblem.programas.Programa;
import haltingproblem.programas.ProgramaFinito;

public class ProgramaFinitoBuilder implements ProgramaBuilder {
    private Programa subPrograma;

    @Override
    public void reset() {
        this.subPrograma = null;
    }

    @Override
    public Programa build(Programa subPrograma) {
        return new ProgramaFinito(subPrograma);
    }
}
