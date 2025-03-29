package haltingproblem.programas;

public class ProgramaInfinito implements Programa {
    private Programa subPrograma;

    public ProgramaInfinito(Programa programa) {
        this.subPrograma = programa;
    }

    @Override
    public void execute() {
        while (!Thread.interrupted()) {
            System.out.println("Ejecutando infinitamente");
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