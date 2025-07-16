// App.java

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
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

    private static void runMaze(){
        boolean[][] predefinedMaze={
            {true,true,true,true},
            {false,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        Maze maze =new Maze(predefinedMaze);
        System.out.println("laberinto cargado");
        maze.printMaze();
        Cell start=new Cell(0, 0);
        Cell end =new Cell(3,3);
        List<MazeSolver> solvers=Arrays.asList(

        
            new MazeSolverRecursivo()
        );
        MazeSolver solver=solvers.get(0);
        List<Cell> path;
        path=solver.getPath(maze.get(0), start, end)

    }
}
