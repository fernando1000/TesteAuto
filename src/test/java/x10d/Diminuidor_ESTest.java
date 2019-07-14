package x10d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Diminuidor_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      int int0 = diminuidor0.subtrai(1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      int int0 = diminuidor0.subtrai(0, (-2663));
      assertEquals(2663, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      int int0 = diminuidor0.divide(0, (-2054));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      int int0 = diminuidor0.divide((-2054), 1);
      assertEquals((-2054), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      // Undeclared exception!
      try { 
        diminuidor0.divide((-1585), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("Diminuidor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      int int0 = diminuidor0.divide((-2026), (-2026));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Diminuidor diminuidor0 = new Diminuidor();
      int int0 = diminuidor0.subtrai((-2026), 1);
      assertEquals((-2027), int0);
  }
}
