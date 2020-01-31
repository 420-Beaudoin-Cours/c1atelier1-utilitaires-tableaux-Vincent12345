
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TableauxTest {

    @Test
    public void trierDecroissantSSS() {
        String[] tab = {"9","8","10","2","3","4","92"};
        String[] exceptedResult = {"92","10","9","8","4","3","2"};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(tab, exceptedResult);
    }

    @Test
    public void testTrierDecroissantSSS() {
        int[] tab= {65,98,78,32,25,69,258,1236,1};
        int[] exceptedResult = {1236,258,98,78,69,65,32,25,1};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(tab, exceptedResult);
    }

    //@Test
    //public void print() {
    //}

    //@Test
    //public void testPrint() {
    //}

    @Test
    public void maximum() {
        int[] tab = {989,2,3,1,5,4,8,687,988,2};
        int exceptedResult = 989;
        int max = Tableaux.maximum(tab);
        assertEquals(max,exceptedResult);
    }

    @Test
    public void testMaximum() {
        String[] tab = {"98","98","97","99","1","8","520"};
        int exceptedResult = 520;
        int max = Tableaux.maximum(tab);
        assertEquals(max,exceptedResult);
    }

    @Test
    public void minimum() {
        int[] tab = {989,2,3,1,5,4,8,687,988,2};
        int exceptedResult = 1;
        int max = Tableaux.minimum(tab);
        assertEquals(max,exceptedResult);
    }

    @Test
    public void testMinimum() {
        String[] tab = {"98","98","97","99","1","8","520"};
        int exceptedResult = 1;
        int max = Tableaux.minimum(tab);
        assertEquals(max,exceptedResult);
    }

    @Test
    public void moyenne() {
        int[] tab = {1,2,3};
        double exceptedResult = 2;
        double moy = Tableaux.moyenne(tab);
        assertEquals(moy, exceptedResult, 0.0);
    }

    @Test
    public void testMoyenne() {
        String[] tab = {"1","2","3"};
        double exceptedResult = 2.0;
        double moy = Tableaux.moyenne(tab);
        assertEquals(moy, exceptedResult, 0.0);
    }

    @Test
    public void fouilleSeq() {
        int[] tab = {3,4,5};
        int exceptedResult = 4;
        int trouve = Tableaux.fouilleSeq(tab,4);
        assertEquals(trouve,exceptedResult);

    }

    @Test
    public void testFouilleSeq() {
        String[] tab = {"3","4","5"};
        int exceptedResult = 4;
        int trouve = Tableaux.fouilleSeq(tab,4);
        assertEquals(trouve,exceptedResult);
    }
}