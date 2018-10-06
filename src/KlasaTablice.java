/**
 * Created by Bogdan on 25-10-2017.
 */
public class KlasaTablice {
    public KlasaTablice() {
    }
    public long SumaTab2(int tab[][]) {
        long suma = 0L;
/*
        for(int i=0; i<tab.length; i++) {
            for(int j=0; j<tab[i].length; j++) {
                suma+=tab[i][j];
            }
        }
*/
        for(int[] i : tab) {
            for (int j : i) {
                suma += j;
            }
        }
        return suma;
    }
    public long SumaTab3(int tab[][][]) {
        int max = tab[0][0][0];
/*
        for(int i=0; i<tab.length; i++) {
            for(int j=0; j<tab[i].length; j++) {
                suma+=tab[i][j];
            }
        }
*/
        for(int[][] i : tab) {
            for (int[] j : i) {
                for (int k : j)
                    if(k > max)
                        max = k;
            }
        }
        return max;
    }
}
