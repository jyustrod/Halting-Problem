package haltingproblem.programas;

public class ProgramaFinito implements Programa {
    private int num;

    public ProgramaFinito(int num) {
        this.num = num;
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
}
