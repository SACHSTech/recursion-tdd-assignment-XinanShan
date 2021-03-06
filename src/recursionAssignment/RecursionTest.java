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
      assertEquals(false, Recursion.array220(new int[]{1, 2, 3}, 0));
    }
    @Test
    public void Test3(){
      assertEquals(false, Recursion.array220(new int[]{3}, 0));
    }
    @Test
    public void Test4(){
      assertEquals(true, Recursion.array220(new int[]{3, 30}, 0));
    }
    @Test
    public void Test5(){
      assertEquals(false, Recursion.array220(new int[]{}, 0));
    }
    @Test
    public void Test6(){
      assertEquals(true, Recursion.array220(new int[]{28, 6, 10, -7, -70, 36}, 0));
    } 
    @Test
    public void Test7(){
      assertEquals(true, Recursion.array220(new int[]{1, 2, 20}, 1));
    } 
    @Test
    public void Test8(){
      assertEquals("yza", Recursion.stringClean("yyzzza"));
    } 
    @Test
    public void Test9(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    } 
    @Test
    public void Test10(){
      assertEquals("", Recursion.stringClean(""));
    } 
    @Test
    public void Test11(){
      assertEquals("y", Recursion.stringClean("y"));
    } 
    @Test
    public void Test12(){
      assertEquals("QSsTBa", Recursion.stringClean("QSsTTBaa"));
    }
    @Test
    public void Test13(){
      assertEquals("y", Recursion.stringClean("yyyyyyyy"));
    }
    @Test
    public void Test14(){
      assertEquals("abcd", Recursion.stringClean("abcd"));
    }
    @Test
    public void Test15(){
      assertEquals(true, Recursion.strCopies("catcowcat", "cat", 2));
    }
    @Test
    public void Test16(){
      assertEquals(false, Recursion.strCopies("catcowcat", "cow", 2));
    }
    @Test
    public void Test17(){
      assertEquals(true, Recursion.strCopies("catcowcat", "cow", 1));
    }
    @Test
    public void Test18(){
      assertEquals(true, Recursion.strCopies("aaaa", "aa", 3));
    }
    @Test
    public void Test19(){
      assertEquals(true, Recursion.strCopies("catcowcat", "cow", 0));
    }
    @Test
    public void Test20(){
      assertEquals(false, Recursion.strCopies("", "cow", 5));
    }
    @Test
    public void Test21(){
      assertEquals(true, Recursion.strCopies("catcatcat", "cat", 3));
    }
    // add more tests
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
}
