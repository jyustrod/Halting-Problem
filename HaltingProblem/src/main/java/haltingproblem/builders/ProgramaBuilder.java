package haltingproblem.builders;

import haltingproblem.programas.Programa;

public interface ProgramaBuilder {
    void reset();
    Programa build(Programa subPrograma);
}