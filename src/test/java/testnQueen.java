import com.test.eQueen.EightQueen;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testnQueen {

    @Test
    public void test8Queen(){
        EightQueen cal= new EightQueen(8,8);
        cal.solve(0);

        assertEquals(92,cal.solveNum);
    }

    @Test
    public void test7Queen(){
        EightQueen cal= new EightQueen(7,7);
        cal.solve(0);

        assertEquals(40,cal.solveNum);
    }

    @Test
    public void test6Queen(){
        EightQueen cal= new EightQueen(6,6);
        cal.solve(0);

        assertEquals(4,cal.solveNum);
    }
    @Test
    public void test5Queen(){
        EightQueen cal= new EightQueen(5,5);
        cal.solve(0);

        assertEquals(10,cal.solveNum);
    }
    @Test
    public void test4Queen(){
        EightQueen cal= new EightQueen(4,4);
        cal.solve(0);

        assertEquals(2,cal.solveNum);
    }
    @Test
    public void test3Queen(){
        EightQueen cal= new EightQueen(3,3);
        cal.solve(0);

        assertEquals(0,cal.solveNum);
    }
    @Test
    public void test2Queen(){
        EightQueen cal= new EightQueen(2,2);
        cal.solve(0);

        assertEquals(0,cal.solveNum);
    }
    @Test
    public void test1Queen(){
        EightQueen cal= new EightQueen(1,1);
        cal.solve(0);

        assertEquals(1,cal.solveNum);
    }
}
