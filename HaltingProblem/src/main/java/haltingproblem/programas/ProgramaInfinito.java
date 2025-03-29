package haltingproblem.programas;

public class ProgramaInfinito implements Programa {
    private int num;

    public ProgramaInfinito(int num) {
        this.num = num;
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
}
