package exercice6;

public class HomeMusicFacade {

    private CdPlayer cdPlayer;
    private TheaterLights theaterLights;

    public HomeMusicFacade(CdPlayer cdPlayer, TheaterLights theaterLights) {
        this.cdPlayer = cdPlayer;
        this.theaterLights = theaterLights;
    }

    public void StartCDtrack(String cd){

        System.out.println("Get ready to listen to " + cd );
        theaterLights.dim(10);
        cdPlayer.on();
        cdPlayer.play(5,cd);
    }

    public void StopCDtrack(){
        System.out.println("Stop listening to CD");
        cdPlayer.stop();
        cdPlayer.eject();
        cdPlayer.off();
        theaterLights.on();
    }
}
