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
    }

    public static void selectionSort(int[] data){
      int checker = 0;
      int swapindex = 0;
      int swapmon = 0;
    for(int i = 0; i < data.length; i++ ){
      checker = data[i];
      swapindex = i;
      for(int j = i; j < data.length; j++){
        if(data[j] < checker){
          checker = data[j];
          swapindex = j;
          Debug.dprint(data);
        }
      }
      swapmon = data[i];
      data[i] = checker;
      data[swapindex] = swapmon;
      //Debug.dprint(data);
    }
    Debug.dprint(data);
  }

    public static void insertionSort(int[] data){
      int remember = 0;
      int k = 0;
      //if(data.length == 0 || data.length == 1){
        //Debug.dprint(data);
      //} else{
      /*if(data[1] < data[0]){
        remember = data[1];
        data[1] = data[0];
        data[0] = remember;
        Debug.dprint(data);
      }*/
    //}
    for(int i = 1; i < data.length; i++){
      k = i - 1 ;
      remember = data[i];
      while(k > 0 && remember < data[k]){
        data[k + 1] = data[k];
        k = k - 1;
      }
      data[k + 1] = remember;
      Debug.dprint(data);
    }
      Debug.dprint(data);
    }
  }
