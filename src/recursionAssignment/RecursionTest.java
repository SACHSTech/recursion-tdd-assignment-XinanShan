package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        assertEquals(Recursion.array220(new int[]{1, 2, 20}, 0), true);
        // assertTrue(TESTBOOLEAN);
    }
    @Test
    public void Test2(){
      assertEquals(Recursion.array220(new int[]{3}, 0), false);
    }
    // add more tests
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
