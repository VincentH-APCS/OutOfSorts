import java.util.Arrays;

public class Debug{

  public static boolean DEBUG = false;

  public static void dreturn(int a){
    if(DEBUG){
      System.out.println(a);
    }
  }

  public static void dprint(int[] arry){
    if(DEBUG){
      System.out.println(Arrays.toString(arry));
    }
  }
}

//:]
