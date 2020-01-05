import java.util.Arrays;
/**
 * Author: Shalee Qureshi
 * Description: BubbleSort algorithm sorts an array into ascending order
 * This program will sort an integer array into ascending order
 */
public class BubbleSort {
  
  
  public static void main(String[] args) { 
  
    //Integer array 
    int number[] = {13, 2, 1, 0, 12}; //Elements    
    
    //Loop to ensure the array is sorted
    for (int i = 0; i < number.length; i++) {
      for (int j = 0; j < number.length - 1; j++) {
        //Following code sorts the array 
        if (number[j] > number[j + 1]){
        int tempLocation = number [j];
        number [j] = number [j + 1];
        number [j + 1] = tempLocation;
        }
      }
    }
    
    System.out.println(Arrays.toString(number));
    
    
    
  }
  
}
