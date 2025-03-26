package haltingproblem.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegistroProgramas {
    private Map<String, ProgramaPrototype> programas = new HashMap<>();

    public void addPrograma(String id, ProgramaPrototype programa) {
        programas.put(id, programa);
    }

    public ProgramaPrototype getPrograma(String id) {
        return programas.get(id).clone();
    }
}
