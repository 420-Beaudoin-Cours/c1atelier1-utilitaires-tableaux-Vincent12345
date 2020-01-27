import java.util.Arrays;

/**
 * @author France Beaudoin
 * @author Vincent Tessier
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2) {
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2) {
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static int[] trierDecroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
        return tab;
    }

    public static String[] trierDecroissantSSS(String[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
        return tab;
    }

    public static void print(int[] tab) {
        System.out.println(Arrays.toString(tab));
    }

    public static void print(String[] tab) {
        System.out.println(Arrays.toString(tab));
    }

    public static int maximum(int[] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (max<tab[i])
                max = tab[i];
        }
        return max;
    }

    public static String maximum(String[] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (max<Integer.parseInt(tab[i]))
                max = Integer.parseInt(tab[i]);
        }
        return String.valueOf(max);
    }

    public static int minimum(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (min>tab[i])
                min = tab[i];
        }
        return min;
    }

    public static String minimum(String[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (min>Integer.parseInt(tab[i]))
                min = Integer.parseInt(tab[i]);
        }
        return String.valueOf(min);
    }

    public static double moyenne(int[] tab){
        int moyenne = 0;
        for (int i=0;i<tab.length-1;i++ ){
            moyenne += tab[i];
        }
        if (tab.length == 0)
            return moyenne;
        else return moyenne/tab.length;
    }

    public static double moyenne(String[] tab){
        int moyenne = 0;
        for (int i=0;i<tab.length-1;i++ ){
            moyenne += Integer.parseInt(tab[i]);
        }
        if (tab.length == 0)
            return moyenne;
        else return moyenne/tab.length;
    }

    public static int fouilleSeq(int[] tab, int nombre){
        int i = 0;
        boolean trouve = false;
        while (i<tab.length && !trouve){
            if (tab[i] == nombre)
                trouve = true;
            else i++;

        }
        if (trouve)
            return tab[i];
        else return -1;
    }

    public static String fouilleSeq(String[] tab, int nombre){
        int i = 0;
        boolean trouve = false;
        while (i<tab.length && !trouve){
            if (Integer.parseInt(tab[i]) == nombre)
                trouve = true;
            else i++;

        }
        if (trouve)
            return String.valueOf(tab[i]);
        else return String.valueOf(-1);
    }
}
