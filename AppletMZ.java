package App;

import java.applet.Applet;
import java.awt.*;

import javax.swing.JPanel;

import maze.*;

public class AppletMZ extends Applet {

  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected JPanel mazepanel;
    protected Maze   simpleMaze;

   

  
    public void init() {
       
       setSize(200, 200);
      this.setLayout(new FlowLayout());
        simpleMaze = SimpleMazeGame.createEvenLargerMaze();
        simpleMaze.setCurrentRoom(1);
        mazepanel = new Maze.MazePanel(simpleMaze);
        this.add(mazepanel);
    }
}