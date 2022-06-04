package exercice6;

public class HomeTheaterTestDrive {
    public static void main (String[] args) {

        CdPlayer cdPlayer = new CdPlayer();
        TheaterLights theaterLights = new TheaterLights();

        HomeMusicFacade homeMusicFacade = new HomeMusicFacade(cdPlayer,theaterLights);
        homeMusicFacade.StartCDtrack("Ray of Light");
        homeMusicFacade.StopCDtrack();
    }
}
