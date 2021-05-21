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
      assertEquals(true, Recursion.array220(new int[]{1, 2, 20}, 0));
        // assertTrue(TESTBOOLEAN);
    }
    @Test
    public void Test2(){
      assertEquals(false, Recursion.array220(new int[]{3}, 0));
    }
    @Test
    public void Test3(){
      assertEquals(true, Recursion.array220(new int[]{3, 30}, 0));
    }
    @Test
    public void Test4(){
      assertEquals(false, Recursion.array220(new int[]{}, 0));
    }
    @Test
    public void Test5(){
      assertEquals(true, Recursion.array220(new int[]{28, 6, 10, -7, -70, 36}, 0));
    } 
    @Test
    public void Test6(){
      assertEquals(true, Recursion.array220(new int[]{1, 2, 20}, 1));
    } 
    @Test
    public void Test7(){
      assertEquals("yza", Recursion.stringClean("yyzzza"));
    } 
    @Test
    public void Test8(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    } 
    // add more tests
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
