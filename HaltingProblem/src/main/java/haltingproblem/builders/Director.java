package haltingproblem.builders;

import haltingproblem.programas.Programa;

public class Director {
    private ProgramaBuilder builder;

    public Director(ProgramaBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(ProgramaBuilder builder) {
        this.builder = builder;
    }

    public void make(String tipo, int num) {
        builder.reset();
        if (tipo.equalsIgnoreCase("finito")) {
            builder.setTipoFinito(num);
        } else {
            builder.setTipoInfinito(num);
        }
    }

    public Programa getPrograma() {
        return builder.getResult();
    }
}