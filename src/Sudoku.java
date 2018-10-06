/**
 * Created by Bogdan on 25-10-2017.
 */
public class Sudoku {
    private int[][][] planszaSudoku;
    public Sudoku() {
        planszaSudoku = new int [9][3][3];
        wypelnijSudoku();
    }

    public int[][][] getPlanszaSudoku() {
        return planszaSudoku;
    }

    public void setPlanszaSudoku(int[][][] planszaSudoku) {
        this.planszaSudoku = planszaSudoku;
    }

    public void wypelnijSudoku() {
        int n = 1;
    /*
        for (int[][] i : planszaSudoku) {
            for (int[] j : i) {
                for (int k : j) {
                    j[k] = n++;
                }
            }
        }
    */
        for(int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    planszaSudoku[i][j][k] = n++;
                    planszaSudoku[i+1][j][k] = n++;
                    planszaSudoku[i+2][j][k] = n++;
                }
            }
        }
    }

    public void drukujPlansze() {
        for(int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.printf("%02d ",planszaSudoku[i][j][k]);
                    System.out.printf("%02d ",planszaSudoku[i+1][j][k]);
                    System.out.printf("%02d ",planszaSudoku[i+2][j][k]);
                }
                System.out.println();
            }
        }

    }
}
