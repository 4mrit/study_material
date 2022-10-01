import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public static synchronized void playSound()
{
  new Thread(new Runnable() {
  // The wrapper thread is unnecessary, unless it blocks on the
  // Clip finishing; see comments.
    public void run() {
      try 
      {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream("ez.wav"));
            clip.open(inputStream);
            clip.start(); 
      } 
      catch (Exception e) 
      {
        System.err.println(e.getMessage());
      }
    }
  }).start();
}