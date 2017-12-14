public class TestSynchronized {
  public static int i = 5;
  puclic static synchonized void methodA() {
    i++;
  }
  
  public void methodB() {
    synchronized(this) {
      i++;
    }
  }
}
