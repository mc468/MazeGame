

package maze; 

import java.awt.*;
import javax.swing.*;

/*
 *  Build a Maze game. 
 *
 *  This implmentation does not use any design patterns. 
 *  Compare the createMaze() method of this class to the ccorresponding method of the following 
 *  classes which create the same Maze using different creational design patterns. 
 *   - MazeGameAbstractFactory: using Abstract Factory design pattern
 *   - MazeGameBuilder: using Builder design pattern
 *
 *  Run the program as follows:
 *   java maze.SimpleMazeGame Large 
 *         -- create a large Maze game
 *   java maze.SimpleMazeGame 
 *         -- create a small Maze game
 */
public class SimpleMazeGame { 

  /**
   *  Creates a small maze with 2 rooms. 
   */ 
  public static Maze createMaze() { 
    Maze maze = new Maze(); 
    Room room1 = new Room(1); 
    Room room2 = new Room(2); 
    Door door = new Door(room1, room2);

    room1.setSide(Direction.NORTH, new Wall());
    room1.setSide(Direction.EAST, door);
    room1.setSide(Direction.SOUTH, new Wall());
    room1.setSide(Direction.WEST, new Wall());
    
    room2.setSide(Direction.NORTH, new Wall());
    room2.setSide(Direction.EAST, new Wall());
    room2.setSide(Direction.SOUTH, new Wall());
    room2.setSide(Direction.WEST, door);

    maze.addRoom(room1);
    maze.addRoom(room2);

    return maze; 
  }

  /**
   *  Creates a large maze with 9 rooms. 
   */ 
  public static Maze createLargeMaze() { 
    Maze maze = new Maze(); 
    Room room1 = new Room(1); 
    Room room2 = new Room(2); 
    Room room3 = new Room(3); 
    Room room4 = new Room(4); 
    Room room5 = new Room(5); 
    Room room6 = new Room(6); 
    Room room7 = new Room(7); 
    Room room8 = new Room(8); 
    Room room9 = new Room(9); 
    Door door1 = new Door(room1, room2);
    Door door2 = new Door(room2, room3);
    Door door3 = new Door(room4, room5);
    Door door4 = new Door(room5, room6);
    Door door5 = new Door(room5, room8);
    Door door6 = new Door(room6, room9);
    Door door7 = new Door(room7, room8);
    Door door8 = new Door(room1, room4);
    
    door1.setOpen(true); 
    door2.setOpen(false); 
    door3.setOpen(true); 
    door4.setOpen(true); 
    door5.setOpen(false); 
    door6.setOpen(true); 
    door7.setOpen(true); 
    door8.setOpen(true); 

    room1.setSide(Direction.NORTH, door8);
    room1.setSide(Direction.EAST, new Wall());
    room1.setSide(Direction.SOUTH, new Wall());
    room1.setSide(Direction.WEST, door1);

    room2.setSide(Direction.NORTH, new Wall());
    room2.setSide(Direction.EAST, door1);
    room2.setSide(Direction.SOUTH, new Wall());
    room2.setSide(Direction.WEST, door2);

    room3.setSide(Direction.NORTH, new Wall());
    room3.setSide(Direction.EAST, door2);
    room3.setSide(Direction.SOUTH, new Wall());
    room3.setSide(Direction.WEST, new Wall());

    room4.setSide(Direction.NORTH, new Wall());
    room4.setSide(Direction.EAST, new Wall());
    room4.setSide(Direction.SOUTH, door8);
    room4.setSide(Direction.WEST, door3);

    room5.setSide(Direction.NORTH, door5);
    room5.setSide(Direction.EAST, door3);
    room5.setSide(Direction.SOUTH, new Wall());
    room5.setSide(Direction.WEST, door4);

    room6.setSide(Direction.NORTH, door6);
    room6.setSide(Direction.EAST, door4);
    room6.setSide(Direction.SOUTH, new Wall());
    room6.setSide(Direction.WEST, new Wall());

    room7.setSide(Direction.NORTH, new Wall());
    room7.setSide(Direction.EAST, new Wall());
    room7.setSide(Direction.SOUTH, new Wall());
    room7.setSide(Direction.WEST, door7);

    room8.setSide(Direction.NORTH, new Wall());
    room8.setSide(Direction.EAST, door7);
    room8.setSide(Direction.SOUTH, door5);
    room8.setSide(Direction.WEST, new Wall());

    room9.setSide(Direction.NORTH, new Wall());
    room9.setSide(Direction.EAST, new Wall());
    room9.setSide(Direction.SOUTH, door6);
    room9.setSide(Direction.WEST, new Wall());

    maze.addRoom(room1);
    maze.addRoom(room2);
    maze.addRoom(room3);
    maze.addRoom(room4);
    maze.addRoom(room5);
    maze.addRoom(room6);
    maze.addRoom(room7);
    maze.addRoom(room8);
    maze.addRoom(room9);

    return maze;
  }
  public static Maze createEvenLargerMaze() { 
      Maze maze = new Maze(); 
      Room room1 = new Room(1); 
      Room room2 = new Room(2); 
      Room room3 = new Room(3); 
      Room room4 = new Room(4); 
      Room room5 = new Room(5); 
      Room room6 = new Room(6); 
      Room room7 = new Room(7); 
      Room room8 = new Room(8); 
      Room room9 = new Room(9); 
      Room room10 = new Room(10);
      Room room11 = new Room(11);
      Room room12 = new Room(12);
      Room room13 = new Room(13);
      Room room14 = new Room(14);
      Room room15 = new Room(15);
      Room room16 = new Room(16);
      Room room17 = new Room(17);
      Room room18 = new Room(18);
      Room room19 = new Room(19);
      Room room20 = new Room(20);
      
      Door door1 = new Door(room1, room6);
      Door door2 = new Door(room1, room2);
      Door door3 = new Door(room2, room3);
      Door door4 = new Door(room3, room8);
      Door door5 = new Door(room3, room4);
      Door door6 = new Door(room4, room5);
      Door door7 = new Door(room5, room10);
      Door door8 = new Door(room10, room15);
      Door door9 = new Door(room10, room9);
      Door door10 = new Door(room8, room9);
      Door door11 = new Door(room8, room13);
      Door door12 = new Door(room12, room13);
      Door door13 = new Door(room13, room14);
      Door door14 = new Door(room14, room15);
      Door door15 = new Door(room20, room15);
      Door door16 = new Door(room20, room19);
      Door door17 = new Door(room18, room19);
      Door door18 = new Door(room17, room18);
      Door door19 = new Door(room16, room17);
      Door door20 = new Door(room16, room11);
      Door door21 = new Door(room6, room11);
      Door door22 = new Door(room6, room7);
      Door door23 = new Door(room7, room12);
      
      door1.setOpen(false); 
      door2.setOpen(true); 
      door3.setOpen(true); 
      door4.setOpen(false); 
      door5.setOpen(true); 
      door6.setOpen(true); 
      door7.setOpen(true); 
      door8.setOpen(false);
      door9.setOpen(true);
      door10.setOpen(true);
      door11.setOpen(true);
      door12.setOpen(false); 
      door13.setOpen(true);
      door14.setOpen(true);
      door15.setOpen(true); 
      door16.setOpen(true);
      door17.setOpen(true);
      door18.setOpen(true);
      door19.setOpen(true);
      door20.setOpen(true);
      door21.setOpen(true);
      door22.setOpen(true);
      door23.setOpen(true);

      room1.setSide(Direction.NORTH, door1);
      room1.setSide(Direction.EAST, door2);
      room1.setSide(Direction.SOUTH, new Wall());
      room1.setSide(Direction.WEST, new Wall());

      room2.setSide(Direction.NORTH, new Wall());
      room2.setSide(Direction.EAST, door3);
      room2.setSide(Direction.SOUTH, new Wall());
      room2.setSide(Direction.WEST, door2);

      room3.setSide(Direction.NORTH, door4);
      room3.setSide(Direction.EAST, door5);
      room3.setSide(Direction.SOUTH, new Wall());
      room3.setSide(Direction.WEST, door3);

      room4.setSide(Direction.NORTH, new Wall());
      room4.setSide(Direction.EAST, door6);
      room4.setSide(Direction.SOUTH, new Wall());
      room4.setSide(Direction.WEST, door5);

      room5.setSide(Direction.NORTH, door7);
      room5.setSide(Direction.EAST, new Wall());
      room5.setSide(Direction.SOUTH, new Wall());
      room5.setSide(Direction.WEST, door6);

      room6.setSide(Direction.NORTH, door21);
      room6.setSide(Direction.EAST, door22);
      room6.setSide(Direction.SOUTH, door1);
      room6.setSide(Direction.WEST, new Wall());

      room7.setSide(Direction.NORTH, door23);
      room7.setSide(Direction.EAST, new Wall());
      room7.setSide(Direction.SOUTH, new Wall());
      room7.setSide(Direction.WEST, door22);

      room8.setSide(Direction.NORTH, door11);
      room8.setSide(Direction.EAST, door10);
      room8.setSide(Direction.SOUTH, door4);
      room8.setSide(Direction.WEST, new Wall());

      room9.setSide(Direction.NORTH, new Wall());
      room9.setSide(Direction.EAST, door9);
      room9.setSide(Direction.SOUTH, new Wall());
      room9.setSide(Direction.WEST, door10);

      room10.setSide(Direction.NORTH, door8);
      room10.setSide(Direction.EAST, new Wall());
      room10.setSide(Direction.SOUTH, door7);
      room10.setSide(Direction.WEST, door9);
      
      room11.setSide(Direction.NORTH, door20);
      room11.setSide(Direction.EAST, new Wall());
      room11.setSide(Direction.SOUTH, door21);
      room11.setSide(Direction.WEST, new Wall());
      
      room12.setSide(Direction.NORTH, new Wall());
      room12.setSide(Direction.EAST, door12);
      room12.setSide(Direction.SOUTH, door23);
      room12.setSide(Direction.WEST, new Wall());
      
      room13.setSide(Direction.NORTH, new Wall());
      room13.setSide(Direction.EAST, door13);
      room13.setSide(Direction.SOUTH, door11);
      room13.setSide(Direction.WEST, door12);
      
      room14.setSide(Direction.NORTH, new Wall());
      room14.setSide(Direction.EAST, door14);
      room14.setSide(Direction.SOUTH, new Wall());
      room14.setSide(Direction.WEST, door13);
      
      room15.setSide(Direction.NORTH, door15);
      room15.setSide(Direction.EAST, new Wall());
      room15.setSide(Direction.SOUTH, door8);
      room15.setSide(Direction.WEST, door14);
      
      room16.setSide(Direction.NORTH, new Wall());
      room16.setSide(Direction.EAST, door19);
      room16.setSide(Direction.SOUTH, door20);
      room16.setSide(Direction.WEST, new Wall());
      
      room17.setSide(Direction.NORTH, new Wall());
      room17.setSide(Direction.EAST, door18);
      room17.setSide(Direction.SOUTH, new Wall());
      room17.setSide(Direction.WEST, door19);
      
      room18.setSide(Direction.NORTH, new Wall());
      room18.setSide(Direction.EAST, door17);
      room18.setSide(Direction.SOUTH, new Wall());
      room18.setSide(Direction.WEST, door18);
      
      room19.setSide(Direction.NORTH, new Wall());
      room19.setSide(Direction.EAST, door16);
      room19.setSide(Direction.SOUTH, new Wall());
      room19.setSide(Direction.WEST, door17);
      
      room20.setSide(Direction.NORTH, new Wall());
      room20.setSide(Direction.EAST, new Wall());
      room20.setSide(Direction.SOUTH, door15);
      room20.setSide(Direction.WEST, door16);
      
     

      maze.addRoom(room1);
      maze.addRoom(room2);
      maze.addRoom(room3);
      maze.addRoom(room4);
      maze.addRoom(room5);
      maze.addRoom(room6);
      maze.addRoom(room7);
      maze.addRoom(room8);
      maze.addRoom(room9);
      maze.addRoom(room10);
      maze.addRoom(room11);
      maze.addRoom(room12);
      maze.addRoom(room13);
      maze.addRoom(room14);
      maze.addRoom(room15);
      maze.addRoom(room16);
      maze.addRoom(room17);
      maze.addRoom(room18);
      maze.addRoom(room19);
      maze.addRoom(room20);
      

      return maze;
    }

  public static void main(String[] args) { 
    Maze maze; 
    if (args.length > 0 &&
	"Large".equals(args[0])) { 
      maze = createLargeMaze();       
    } else {
      maze = createMaze(); 
    }
    maze.setCurrentRoom(1); 
    
    JFrame frame;    
    frame = new JFrame("Maze");
    frame.setContentPane(new Maze.MazePanel(maze)); 
    frame.pack();
    Dimension frameDim = frame.getSize(); 
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(screenSize.width / 2 - frameDim.width / 2, 
		      screenSize.height / 2 - frameDim.height / 2);    
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
    frame.setVisible(true);
  }

}
