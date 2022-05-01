package exercice3;

public class Guitar extends Stringed implements Soloist{

    public void play(){
        System.out.println("Guitar plays like an Instrument");
    }

    public void playLikeASoprano() {
        System.out.println("Guitar cannot play like a Soprano");
    }

    public void playLikeATenor() {
        System.out.println("Guitar plays like a Tenor");
    }
}
