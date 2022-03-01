import java.util.LinkedList;
import java.util.ListIterator;


public class Linkedlist_Lab {
    public static void main(String[] args) {

      LinkedList<Integer> linkt= new LinkedList<Integer>();
      LinkedList<Integer> linkt2= new LinkedList<Integer>();

      linkt.add(1);
      linkt.add(3);
      linkt.add(5);
      linkt.add(7);
      linkt.add(9);
      linkt.add(11);
      
      //Question 1
      System.out.println("Original LinkedList: "+linkt);
      addAndSort(linkt,10);
      System.out.println("After adding 10 and sorted: "+linkt);
      System.out.println();
      //Question 2
      System.out.println("Unswapped Linkedlist: "+linkt);
      swapValues(linkt, 1, 3);
      System.out.println("Swap index 1 and 3: "+linkt);
      System.out.println();
      // Question 3
      int min= 1000;
      int max= 9999;
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      int test= findValue(linkt2, random_int);
      if (test==-1){
        System.out.println("Random number not found!");
      } 
      else {
        System.out.println("Random number "+ random_int+ " found at index "+ test);
      }

    }

    public static void addAndSort(LinkedList<Integer> list, int add) {

      int temp=0;
      ListIterator<Integer> iterator = list.listIterator();
      while (iterator.hasNext()){
            if (add> iterator.next()) {
              temp= iterator.previousIndex()+1;
            }      
      }
      list.add(temp, add);

    }

    public static void swapValues(LinkedList<Integer> list,int indexOne, int indexTwo) {

      int temp_index1= list.get(indexOne);
      int temp_index2= list.get(indexTwo);
      list.set(indexOne, temp_index2);
      list.set(indexTwo, temp_index1);
    }

    public static int findValue(LinkedList<Integer> list,int searchValue) {

      int min= 1000;
      int max= 9999;
      int random_int; 

      for (int i=0; i<500; i++) {
        random_int=(int)Math.floor(Math.random()*(max-min+1)+min);
        list.add(random_int);
      }

      for (int j=0; j<list.size(); j++) {
          if (list.get(j)== searchValue) {
            return j;
            
          }
      }
      return -1;
    }

}


    


    
    


   


