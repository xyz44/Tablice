/**
 * Created by Bogdan on 25-10-2017.
 */
public class Test {
    public static void main(String[] args) {
        int tab[][] = new int[2][2];
        int tab1[][][] = new int [2][2][2];
        KlasaTablice klTab = new KlasaTablice();
        Sudoku sd;

        tab[0][0] = 10;
        tab[0][1] = 25;
        tab[1][0] = 30;
        tab[1][1] = 40;
        //System.out.println("Suma = " + klTab.SumaTab2(tab));
        tab1[0][0][0] = 10;
        tab1[0][1][0] = 250;
        tab1[1][0][0] = 3001;
        tab1[1][1][1] = 40;
        //System.out.println("Max = " + klTab.SumaTab3(tab1));
        sd = new Sudoku();
        sd.drukujPlansze();
    }
}
