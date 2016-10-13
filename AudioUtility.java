package util;
import App.AppletMZ;

import java.applet.*; 
import java.net.*;

public class AudioUtility { 

  public static final AudioClip getAudioClip(String filename) { 
    if (filename != null) { 
      try { 
  return Applet.newAudioClip(AppletMZ.class.getResource("/" + filename));
      } catch (Exception e) { 
  System.err.println(e.getMessage());
      }
    }
    return null;
  }

public static void setcodebase(URL codeBase) {
  URL url = codeBase;
  
}


}