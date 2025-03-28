package haltingproblem.programas;

public class ProgramaFinito implements Programa {
    private int num;
    private Programa subPrograma;

    public ProgramaFinito(int num, Programa subPrograma) {
        this.num = num;
        this.subPrograma = subPrograma;
    }

    @Override
    public void execute() {
        while (num > 0 && !Thread.interrupted()) {
            System.out.println(num);
            num--;
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
