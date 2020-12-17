import java.util.Arrays;
public class Sorts{

  public static void dprint(int[] data){
    public static boolean DEBUG = true;
    if(DEBUG){
      System.out.println(data.toString());
    }
  }

  public static void bubbleSort(int[] data){

    int lastcheck = 0;
    for(int i = 0; i < data.length - lastcheck; i++){
      if(data[i] > data[i + 1]){
        for(int j = i; j < data.length - lastcheck; j++){
          if(data[j] > data[j + 1]){
            int swapper = data[j + 1];
            data[j + 1] = data[j];
            data[j] + swapper;
                         }
            dprint(data);
                       }
            lastcheck = lastcheck + 1;
                    }
              }
    }

  }
