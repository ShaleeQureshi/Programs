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
    
    File file = new File ("FileReading.txt");
    FileReader fileR = new FileReader (file);
    BufferedReader readFile = new BufferedReader (fileR);
    
    String line[]; 
    line = new String [3];
    
    for (int i = 0; i < line.length; i++) {
    line[i] = readFile.readLine();
    System.out.println(line[i]); 
    }
    readFile.close();
    
  }
  
  
}
