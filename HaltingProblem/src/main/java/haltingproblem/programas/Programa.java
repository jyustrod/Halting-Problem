package haltingproblem.programas;

public interface Programa {
    void execute();
    int getNum();
    Programa getSubPrograma();
}
