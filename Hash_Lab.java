import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hash_Lab {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
        System.out.println();
        // Question 4
        hm.put(0, 1);
        hm.put(1, 3);
        hm.put(2, 5);
        hm.put(3, 7);
        hm.put(4, 9);
        hm.put(5, 11);

        System.out.println("Original Hashmap: "+hm);
        addAndSort(hm, 4);
        System.out.println("Sorted Hashmap after adding 4: "+hm);

        System.out.println();
        
        // Question 5
        System.out.println("Before Swap: "+hm);
        swapValues(hm, 1, 2);
        System.out.println("After Swap index 1 and 2: "+hm);

        System.out.println();

        // Question 6
        HashMap<Integer, Integer> hm2= new HashMap<Integer, Integer>();
        int min= 1000;
        int max= 9999;

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int test= findValue(hm2, random_int);
        //System.out.println(hm2);
        if (test==-1){
            System.out.println("Random number not found!");
        }
        else {
            System.out.println("Random number "+ random_int+ " found at index "+ test);
        }
    }

    public static void addAndSort(HashMap<Integer, Integer> hm, int value) {

        int last_elemennt= hm.size();
        int temp_index1, temp_index2; 
        hm.put(last_elemennt, value);

        for (int i=last_elemennt; i>0; i--){
            temp_index1= hm.get(i);
            temp_index2= hm.get(i-1);
          if (temp_index1< temp_index2){
            hm.replace(i, temp_index2);
            hm.replace(i-1, temp_index1);
          }
        }

      
        
      }

      public static void swapValues(HashMap<Integer, Integer> hm,int indexOne, int indexTwo) {
        
        int temp_index1= hm.get(indexOne);
        int temp_index2= hm.get(indexTwo);
        hm.replace(indexOne, temp_index2);
        hm.replace(indexTwo, temp_index1);
      }

      public static int findValue(HashMap<Integer, Integer> hm, int searchValue) {

        int min= 1000;
        int max= 9999;
        int random_int; 
  
        for (int i=0; i<500; i++) {
          random_int=(int)Math.floor(Math.random()*(max-min+1)+min);
          hm.put(i, random_int);
          
        }

        for(Entry<Integer, Integer> entry: hm.entrySet()) {
            if (searchValue==entry.getValue()) {
              return entry.getKey();
            }      
        }
        return -1;

        
  
      }
}
