package x10d;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Somador_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Somador somador0 = new Somador();
      int int0 = somador0.soma((-1693), 2720);
      assertEquals(1027, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Somador somador0 = new Somador();
      int int0 = somador0.soma((-1452), 0);
      assertEquals((-1452), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Somador somador0 = new Somador();
      int int0 = somador0.multiplica(7924225, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Somador somador0 = new Somador();
      int int0 = somador0.multiplica(2720, (-1427));
      assertEquals((-3881440), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Somador somador0 = new Somador();
      int int0 = somador0.soma(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Somador somador0 = new Somador();
      int int0 = somador0.multiplica((-516), (-516));
      assertEquals(266256, int0);
  }
}
