public class Sorts{

  public static void bubbleSort(int[] data){

    int lastcheck = 0;
    for(int i = 0; i < data.length - lastcheck - 1; ){
      if(data[i] > data[i + 1]){
        for(int j = i; j < data.length - lastcheck - 1; j++){
          if(data[j] > data[j + 1]){
            int swapper = data[j + 1];
            data[j + 1] = data[j];
            data[j] = swapper;
            Debug.dprint(data);
                         }
                       }
            i = 0;
            lastcheck = lastcheck + 1;
          Debug.dreturn(lastcheck);
          }
          else i++;
       }
       Debug.dprint(data);
    }

    public static void selectionSort(int[] data){
      int swapindex = 0;
      int swapmon = 0;
    for(int i = 0; i < data.length; i++ ){
      swapindex = i;
      for(int j = i; j < data.length; j++){
        if(data[j] < data[swapindex]){
          swapindex = j;
        }
      }
      swapmon = data[i];
      data[i] = data[swapindex];
      data[swapindex] = swapmon;
      Debug.dprint(data);
    }
    Debug.dprint(data);
  }

    public static void insertionSort(int[] data){
      int remember = 0;
      int k = 0;
    for(int i = 1; i < data.length; i++){
      k = i - 1 ;
      remember = data[i];
      while(k >= 0 && remember < data[k]){
        data[k + 1] = data[k];
        k = k - 1;
      }
      data[k + 1] = remember;
      Debug.dprint(data);
    }
      Debug.dprint(data);
    }
  }
