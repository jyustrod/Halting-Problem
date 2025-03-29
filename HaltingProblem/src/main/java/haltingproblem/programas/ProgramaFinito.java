package haltingproblem.programas;

public class ProgramaFinito implements Programa {
    private Programa subPrograma;

    public ProgramaFinito(Programa programa) {
        this.subPrograma = programa;
    }

    @Override
    public void execute() {
        int num = 10; // Valor arbitrario para ejecución finita
        while (num > 0 && !Thread.interrupted()) {
            System.out.println(num);
            num--;
        }
        if (subPrograma != null) {
            subPrograma.execute();
        }
    }

    @Override
    public Programa getSubPrograma() {
        return subPrograma;
    }
}