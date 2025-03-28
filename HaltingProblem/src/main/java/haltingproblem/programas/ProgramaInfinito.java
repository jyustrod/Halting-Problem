package haltingproblem.programas;

public class ProgramaInfinito implements Programa {
    private int num;
    private Programa subPrograma;

    public ProgramaInfinito(int num, Programa subPrograma) {
        this.num = num;
        this.subPrograma = subPrograma;
    }

    @Override
    public void execute() {
        while (!Thread.interrupted()) {
            System.out.println(num);
            num++;
        }
    }

    public int getNum() {
        return num;
    }

    @Override
    public Programa getSubPrograma() {
        return subPrograma;
    }
}