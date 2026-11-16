package looseCoupling;


/*
   Cohesion - Defines interaction between objects
     Low cohesion - BAD
     High cohesion - GOOD  (GOOD MODULARITY)
  Coupling - Dependency among objects
     Tight coupling - BAD
     Loose coupling - GOOD (ISNT GOING TO IMPACT OTHER OBJECTS)
  Interface for loosely coupled code

  WHERE AN INTERFACE CAN BE USED ? YOU NEED TO BUILD A COUPLE SYSTEM

     client(code)                                                   Implementation (MP4Player)
     client(code)    --------->Interface (VideoPlayer)------------- Implementation (MovPlayer)
     client (code)                                                  Implementation

            You can switch the implementation without impacting the client code
            Client will depend on the interface not the implementation for better modularity and flexibility
 */

import java.util.Scanner;

interface VideoPlayer {
    void play(String file);
    //void stop();
}

class MP4Player implements  VideoPlayer{
    @Override
    public void play(String file) {
        System.out.println("Playing MP4" + file);
    }

}

class MOVPlayer implements  VideoPlayer{
    @Override
    public void play(String file) {
        System.out.println("MOVPlayer playing the file " + file);
    }

}

class PlayerFactory{
    public static VideoPlayer getVideoPlayer(String type){
        if(type.endsWith("mp4")){
            return new MP4Player();
        }
        if(type.endsWith("mov")){
            return new MOVPlayer();
        }
        return null;
    }
}

public class LooseCouplingEx {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Which file you want to play ? ");
      String file = sc.nextLine();


     // MOVPlayer player1 = new MOVPlayer();// This is client code
        VideoPlayer player = PlayerFactory.getVideoPlayer(file);
        if (player == null){
            System.out.println("could not find a player for the given file");
        }else{
            player.play(file);
        }


    }
}

// if(type.equals("mp4")){
//        return new MP4Player();
//        }else if(type.equals("mov")){  //if(
//        return new MOVPlayer();
//        }
//                return null;
