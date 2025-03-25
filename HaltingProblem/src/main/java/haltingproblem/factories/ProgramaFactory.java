package haltingproblem.factories;

import haltingproblem.programas.Programa;

public interface ProgramaFactory {

   Programa  crearPrograma(int valor);
}