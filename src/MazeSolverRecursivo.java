import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursivo {
    
    public List<Cell> getPath(Boolean [][] grid, Cell start, Cell end){
        if (grid==null||grid.length==0) {
            return new ArrayList<>();
        }
        return null;
        List<Cell> path=new ArrayList<>();
        if (findPaht(grid,start,end,path)) {
            return path;
        }
        return new ArrayList<>();

    }

    private boolean findPaht(Boolean[][] grid, Cell start, Cell end, List<Cell> path) {
        int row =start.row;
        int col=start.col;
        if (row>=grid.length||col>=grid[0].length||!grid[row][col]) {
            return false;
        }
        if (row==end.row&&col==end.col) {
            path.add(start);
            return true;
        }
        if (findPaht(grid, new Cell(row+1,col), end, path)) {
            path.add(start);
            return true;

        }
        return true;
    }
}
