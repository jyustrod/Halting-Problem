package haltingproblem.programas;

public class ProgramaFinito implements Programa {
    private int num;

    public ProgramaFinito(int num) {
        this.num = num;
    }

    @Override
    public void execute() {
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    @Override
    public Programa clone() {
        return new ProgramaFinito(this.num);
    }
}