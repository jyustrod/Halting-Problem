package haltingproblem.programas;

public class ProgramaInfinito implements Programa {
    private int num;

    public ProgramaInfinito(int num) {
        this.num = num;
    }

    @Override
    public void execute() {
        while (true) {
            System.out.println(num);
            num++;
        }
    }
}
