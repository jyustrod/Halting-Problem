package haltingproblem.programas;

import haltingproblem.prototype.ProgramaPrototype;

public class ProgramaInfinito implements ProgramaPrototype {
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

    @Override
    public ProgramaPrototype clone() {
        return new ProgramaInfinito(this.num);
    }

    public int getNum() {
        return num;
    }
}