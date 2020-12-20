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
      int sorted = 0;
      int remember = 0;
      int ime = 0;
      if(data.length == 0 || data.length == 1){
      }
      else
      for(int i = 1; i < data.length; i++){
        ime = i;
        if(data[i] >= data[i - 1]){
        }
        else while(ime > 0){
          remember = data[i];
          if(data[ime] >= data[ime - 1]){
            data[ime] = remember;
            ime = 0;
          }
          else data[ime + 1] = data[ime];
          ime = ime - 1;
        }

          }
        }
      }
