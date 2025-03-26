package haltingproblem.prototype;

import haltingproblem.programas.Programa;

public interface ProgramaPrototype extends Programa {
    ProgramaPrototype clone();
}
