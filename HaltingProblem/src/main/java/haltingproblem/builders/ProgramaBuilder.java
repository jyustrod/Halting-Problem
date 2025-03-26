package haltingproblem.builders;

import haltingproblem.programas.Programa;

public interface ProgramaBuilder {
    void reset();
    void setTipoFinito(int num);
    void setTipoInfinito(int num);
    Programa getResult();
}