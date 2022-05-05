package exercice4;

public class Flute extends Woodwind implements Soprano {

    public void play(){
        System.out.println("Flute plays like an Instrument");
    }

    @Override
    public void playLikeASoprano() {
        System.out.println("Flute plays like a Soprano");
    }
}
