package haltingproblem.factories;

import haltingproblem.programas.ProgramaInfinito;
import haltingproblem.programas.Programa;

public class ProgramaInfinitoFactory implements ProgramaFactory{

    public Programa crearPrograma(int valor){
        ProgramaInfinito programa = new ProgramaInfinito(valor);
        return programa;
    } 
}