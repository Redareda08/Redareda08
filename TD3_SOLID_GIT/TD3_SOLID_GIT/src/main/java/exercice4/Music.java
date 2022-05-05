package exercice4;


public class Music {
    public static void main(String[] args){
        Orchestra orchestra = new Orchestra();
        Percussion p = new Percussion();
        Trombone t = new Trombone();
        Guitar g = new Guitar();
        Violin v = new Violin();
        Flute f = new Flute();
        orchestra.addInstrument(p);
        orchestra.addInstrument(t);
        orchestra.addInstrument(g);
        orchestra.addInstrument(v);
        orchestra.addInstrument(f);
        orchestra.tuneAll();
        orchestra.tuneTenor(t);
        orchestra.tuneSoprano(v);
        orchestra.tuneSoprano(f);
        orchestra.tuneTenor(g);
    }
}
