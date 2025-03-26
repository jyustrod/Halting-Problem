package haltingproblem.programas;

import haltingproblem.prototype.ProgramaPrototype;

public class ProgramaFinito implements ProgramaPrototype {
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
    public ProgramaPrototype clone() {
        return new ProgramaFinito(this.num);
    }
}