# Halting Problem Simulator

Este proyecto es una simulación del problema de la parada utilizando Java. Implementa diversas máquinas y programas para analizar si un programa se detendrá o se ejecutará indefinidamente.

https://github.com/jyustrod/Halting-Problem.git

## Descripción

El proyecto modela el problema de la parada con las siguientes clases clave:

- **`Programa`**: Interfaz base para los programas ejecutables.
- **`ProgramaFinito` y `ProgramaInfinito`**: Implementaciones de `Programa` que simulan ejecuciones finitas e infinitas.
- **`HaltChecker`**: Máquina que intenta determinar si un programa se detiene o no.
- **`Reverser`**: Máquina que invierte la salida de `HaltChecker`, ejecutándose indefinidamente si el programa se detiene y viceversa.
- **`MaquinaX`**: Máquina que toma un programa como entrada y lo pasa por `HaltChecker`, enviando el resultado a `Reverser`, generando la paradoja del problema de la parada.
- **`Director` y `ProgramaBuilder`**: Implementan el patrón Builder para construir programas.
- **`Main`**: Punto de entrada para probar el sistema.

## Estructura del Proyecto

```
haltingproblem/
├── builders/
│   ├── Director.java
│   ├── ProgramaBuilder.java
│   ├── ProgramaFinitoBuilder.java
│   ├── ProgramaInfinitoBuilder.java
├── maquinas/
│   ├── HaltChecker.java
│   ├── Reverser.java
│   ├── MaquinaX.java
├── programas/
│   ├── Programa.java
│   ├── ProgramaFinito.java
│   ├── ProgramaInfinito.java
├── Main.java
```

## Instalación y Ejecución

1. Clona el repositorio:

   ```bash
   git clone <repositorio>
   cd haltingproblem
   ```

2. Compila el proyecto con:

   ```bash
   javac -d bin $(find . -name "*.java")
   ```

3. Ejecuta el programa principal:

   ```bash
   java -cp bin haltingproblem.Main
   ```

## Ejemplo de Ejecución

El `Main` prueba diferentes escenarios:

1. **Programa Finito** → `HaltChecker` indica que se detiene.
2. **Programa Infinito** → `HaltChecker` indica que no se detiene.
3. **Reverser** → Si `HaltChecker` dice que se detiene, `Reverser` entra en bucle infinito.
4. **MaquinaX con MaquinaX** → Causa la paradoja de la parada.

Salida esperada:

```
Probando programa finito:
El programa ha terminado.

Probando programa infinito:
El programa no ha terminado a tiempo.

Probando Reverser con programa finito:
(Reverser se ejecuta infinitamente)

Probando Reverser con programa infinito:
Reverser ha parado.

Probando MaquinaX con MaquinaX:
(Paradoja detectada)
```

## Referencias

- [El problema de la parada (Halting Problem)](https://es.wikipedia.org/wiki/Problema_de_la_parada)
- [Explicación visual del problema](https://www.youtube.com/watch?v=92WHN-pAFCs)

## Licencia

Este proyecto se distribuye bajo la licencia Apache 2.0.
