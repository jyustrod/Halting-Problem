package haltingproblem.builders;

import haltingproblem.programas.Programa;

public class Director {
    private ProgramaBuilder builder;

    public Director(ProgramaBuilder builder) {
        this.builder = builder;
    }

    public void cambiarBuilder(ProgramaBuilder builder) {
        this.builder = builder;
    }

    public Programa construirPrograma(Programa programa) {
        return builder.build(programa);
    }
}