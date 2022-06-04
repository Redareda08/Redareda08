package exercice6;

public class CdPlayer {

    public void on(){
        System.out.println("CD Player on");
    }

    public void off(){
        System.out.println("CD Player off");
    }

    public void eject(){
        System.out.println("CD Player eject");
    }

    public void stop(){
        System.out.println("CD Player stopped");
    }

    public void play(int tracks,String track){
        System.out.println("CD Player playing " + "\"" + track + "\"");
        for(int i=0;i<tracks;i++) {
            System.out.println("CD Player playing track " + i);
        }
    }

}
