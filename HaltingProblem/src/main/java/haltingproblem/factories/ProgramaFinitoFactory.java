package haltingproblem.factories;

import haltingproblem.programas.ProgramaFinito;
import haltingproblem.programas.Programa;

public class ProgramaFinitoFactory implements ProgramaFactory{

    public Programa crearPrograma(int valor){
        ProgramaFinito programa = new ProgramaFinito(valor);
        return programa;
    } 
}