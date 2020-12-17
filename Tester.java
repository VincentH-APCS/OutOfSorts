import java.util.Random;

public class Tester{

  public static void RAmaker(int[] arry){
    Random rng = new Random();
    rng = new Random(55);
    for(int i = 0; i < arry.length; i++){
      arry[i] = rng.nextInt() % 1000;
    }
   }

  public static void main(String[] args){
    int[] stats = {6,3,2,1,4,5};
    int[] numbas ={98,7,62,0,3,2,1056, -2, 20, -1,43,52,11,43,9};
    int[] randoms = new int[20];
   //Sorts.bubbleSort(stats);
  // Sorts.bubbleSort(numbas);
  RAmaker(randoms);
  System.out.println(randoms.length);
  Sorts.bubbleSort(randoms);
}
}
