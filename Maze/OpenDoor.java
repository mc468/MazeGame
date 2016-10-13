package maze;


import java.applet.AudioClip;
import java.awt.Component;


public class OpenDoor implements Command { 

  protected Maze maze;
  protected Room rom;
  protected static AudioClip computer = util.AudioUtility.getAudioClip("audio/computer.au");

public OpenDoor(Maze maze) { 
    this.maze = maze;
    rom = maze.getCurrentRoom();   
    for(Direction dir = Direction.first(); dir != null; dir = dir.next()) {
      MapSite sid = rom.getSide(dir);
    if(sid instanceof Door&&!((Door) sid).isOpen()){
      ((Door) sid).setOpen(true);
      computer.play();
      
    }
    }

  }

  public void execute() {
 
  }
}