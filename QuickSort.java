import java.util.Arrays;
/**
 * Author: Shalee Qureshi
 * Description: A quicksort algorithm that will sort an integer array into ascending order
 */
public class QuickSort {
  
  //This method will compare the pivot value (retrieved from the parition method)to all other values in the array
  //Called recursive method
  public static void quickSort(int[] array, int start, int end){
    
    //Declaring an inteer variable and initializing it to the pivot value -
    //that is returned from the partition method
    int divider = partition(array, start, end);
    
    //If the divider value - 1 is greater than the initial value (index of 0) the following will occur
    if(divider -1 > start) {
      //Recalling the quickSort method and subtracting 1 
      //This will continue to happen until the condition is met
      quickSort(array, start, divider - 1);
    }
    //If the divider + 1 is less than the final value (length of array - 1) the following will occur
    else if(divider +1 < end) {
      //Recalling the quickSort method and adding 1
      //This will continue to happen until the condition is met
      quickSort(array, divider + 1, end); //Calling quickSort method to sort the values
    }
    
  }//quickSort Method
  
  //This method sorts the data based off of a pivot value
  public static int partition(int array[], int startPoint, int endPoint){
    
    //Declaring and initializing the pivot value to the final value in the integer array
    int pivot = array[endPoint];
    
    //Loop to go through the array
    for(int i = startPoint; i < endPoint; i++){
      //If the values in the array are less than the pivot value the following will occur
      if(array[i] < pivot){
        //Swapping the elements
        int tempLocation = array[startPoint]; //Creating a temp location for the initial array value
        array[startPoint] = array[i];
        array[i] = tempLocation;
        startPoint++; //Adding to startPosition to keep the loop going until the array is finished
      }
    }
    
    int tempLocation = array[startPoint];
    array[startPoint] = pivot;
    array[endPoint] = tempLocation;
    
    return startPoint; //Returning the starting value
    
  }//partition Method
  
  public static void main(String[] args) {
    
    //Declaring and initializing an integer array
    int array[] = {4, 5, 1, 2, 9, 90};
    
    //Calling the quicksort method
    quickSort(array, 0, array.length-1); 
    //0 for start = beginning value in array
    //array.length - 1 = final value in array
    
    System.out.println(Arrays.toString(array));
  }//main Method
}//class Sort
