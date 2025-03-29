package haltingproblem.maquinas;

import haltingproblem.programas.Programa;
import java.util.concurrent.*;

public class HaltChecker {
    private static final int TIMEOUT_SECONDS = 2;

    public static boolean sePara(Programa programa) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(programa::execute);

        try {
            for (int i = 0; i < TIMEOUT_SECONDS; i++) {
                Thread.sleep(1000);
            }
            future.cancel(true);
            return false;
        } catch (InterruptedException e) {
            future.cancel(true);
            return false;
        } finally {
            executor.shutdownNow();
        }
    }
}