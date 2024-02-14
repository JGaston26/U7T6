import java.util.ArrayList;

public class Sort {

    // PART A. implementing insertion sort
    public static void insertionSort(int[] elements) {
        int count = 0;
       for(int i = 1; i < elements.length; i++){
           int min = i;
           int temp = elements[min];
           while(min > 0 && elements[min-1] > temp){
               count++;
                elements[min] = elements[min-1];
                min--;
           }
           elements[min] = temp;
       }
        System.out.println(count);
    }
    public static void selectionSort(int[] elements) {
        int count = 0;
        for(int i = 0; i < elements.length; i++){
            int min_index = i;
            for(int j = i+1; j < elements.length; j++){
                count++;
                if(elements[j] < elements[min_index]){
                    min_index = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min_index];
            elements[min_index] = temp;
        }
        System.out.println(count);
    }


    // PART B. sorting a word list
    public static void insertionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me like part A except sorting an arraylist of Strings
    }
}
