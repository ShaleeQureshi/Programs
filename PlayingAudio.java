import javax.sound.sampled.AudioSystem; //Entry point to the stream
import javax.sound.sampled.Clip; //Way to open the file
import javax.sound.sampled.FloatControl; //To get control over a  range of floating values
import java.io.File;
import java.lang.Math; //For mathematical calculations
import javax.swing.JOptionPane;
/**
 * Author: Shalee Qureshi
 * Description: This program plays a .wav audio file and allows the user to adjust the volume of the file
 */
public class PlayingAudio {
  
  public static void playAudio (String filePath, float volume) {
  
    try{
    
    File file = new File (filePath); 
    Clip clip = AudioSystem.getClip();
    clip.open(AudioSystem.getAudioInputStream(file));
    
    //If you do not want the user to be able to adjust the volume just do clip.start() -
    //and exclude the following code
    
    FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    
    float volRange = (float) (Math.log(volume) / Math.log(10) * 20);
    
    control.setValue(volRange);
    
    clip.start();
    //To make the clip loop infinitly do the following otherwise the audiofile will play only once
    //clip.loop(Clip.LOOP_CONTINUOUSLY);
    
    
    } catch (Exception error) {
    JOptionPane.showMessageDialog(null, "An unexpected error has occured");
    }
    
  }//playAudio Method
  
  public static void main(String[] args) { 
    
    //Now just call the method and fill in the parameters
    
    //playAudio (enter the filepath of the audio-file, the volume you want (between 0 - 100)
    
    
  }//main Method
 
}//PlayingAudio Class
