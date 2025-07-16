// App.java
public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("--- Fibonacci Recursivo ---");

        int n = 100; 

        long startTime = System.nanoTime(); 
        long resultadoRecursivo = ejerciciosPD.getFibonaci(n);
        long endTime = System.nanoTime(); 
        long durationRecursivo = (endTime - startTime) / 1_000_000; 
        System.out.println("Fibonacci(" + n + ") (Recursivo) = " + resultadoRecursivo + " | Tiempo: " + durationRecursivo + " ms");
        System.out.println("------------------------------------");

        System.out.println("--- Fibonacci Recursivo con Caching (PD) ---");
        int nPD = 100; 
        ejerciciosPD.clearCache();
        startTime = System.nanoTime();
        long resultadoPD = ejerciciosPD.getFibonaciPD(nPD);
        endTime = System.nanoTime();
        long durationPD = (endTime - startTime) / 1_000_000; 
        System.out.println("Fibonacci(" + nPD + ") (Caching) = " + resultadoPD + " | Tiempo: " + durationPD + " ms");
        System.out.println("------------------------------------");
    }
}
