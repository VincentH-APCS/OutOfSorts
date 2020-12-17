import java.util.Random;
public class OmniTester{

  public static void RAmaker(int[] arry){
    Random rng = new Random();
    rng = new Random(77);
    for(int i = 0; i < arry.length; i++){
      arry[i] = rng.nextInt() % 1000;
    }
   }

   public static void RAmaker2(int[] arry){
     Random nrg = new Random();
     nrg = new Random(12);
     for(int i = 0; i < arry.length; i++){
       arry[i] = nrg.nextInt() % 1000;
     }
    }

    public static void RAmaker3(int[] arry){
      Random grn = new Random();
      grn = new Random(43);
      for(int i = 0; i < arry.length; i++){
        arry[i] = grn.nextInt() % 1000;
      }
     }

  public static void main(String[] args){
      int[] numbas ={98,7,62,0,3,2,1056, -2, 20, -1,43,52,11,43,9};
      //[-2, -1, 0, 2, 3, 7, 9, 11, 20, 43, 43, 52, 62, 98, 1056]
      int[] randoms = new int[20];
      //[-781, -750, -673, -449, -357, -354, -267, -242, -94, -76, -52, 109, 263, 277, 342, 402, 669, 674, 746, 863]
      int[] idks = new int[21];
      //[-853, -795, -768, -690, -563, -286, -265, -234, -224, 14, 113, 123, 137, 193, 249, 266, 390, 422, 624, 745]
      int[] whoa = new int[19];
      //[-948, -784, -582, -543, -500, -480, -416, -367, -162, -99, -55, 103, 232, 262, 595, 844, 861, 885, 896, 973]
      int[] finalcheck = {0,0,0,1,0,0,0,1,0,0,2,0,0,0,1,1,5,0,0,1000,0};
      //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 1000]
    RAmaker(randoms);
    RAmaker2(idks);
    RAmaker3(whoa);
    Sorts.bubbleSort(numbas);
    Sorts.bubbleSort(randoms);
    Sorts.bubbleSort(idks);
    Sorts.bubbleSort(whoa);
    Sorts.bubbleSort(finalcheck);
  }
}
