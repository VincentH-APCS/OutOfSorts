public class Sorts{

  public static void bubbleSort(int[] data){

    int lastcheck = 0;
    for(int i = 0; i < data.length - lastcheck; ){
      if(data[i] > data[i + 1]){
        for(int j = i; j < data.length - lastcheck - 1; j++){
          if(data[j] > data[j + 1]){
            int swapper = data[j + 1];
            data[j + 1] = data[j];
            data[j] = swapper;
                         }
            Debug.dprint(data);
                       }
            i = 0;
            lastcheck = lastcheck + 1;
            Debug.dreturn(lastcheck);
          }
          else i++;
       }
    }
  }
