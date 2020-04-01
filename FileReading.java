import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File; 
import java.io.IOException;
/**
 * Author: Shalee Qureshi 
 * Description: This program reads from a file and displays the information
 */
public class FileReading {
  
  
  public static void main(String[] args) throws IOException { 
    
    File file = new File ("the file"); 
    FileReader fileR = new FileReader (file);
    BufferedReader readFile = new BufferedReader (fileR);
    
    String line;

    //Loop to read from the file as long as the contents are not null
    while ((line = readFile.readLine()) != null){
    System.out.println(line); //Dispalying the contents
    }
    
    fileR.close(); //Closing the stream
    readFile.close(); //Closing the reader
    
  }
  
  
}
