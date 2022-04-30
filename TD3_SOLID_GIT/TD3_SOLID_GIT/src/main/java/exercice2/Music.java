package exercice2;

public class Music {
    public static void main(String[] args){
        Orchestra orchestra = new Orchestra();
        Wind wind = new Wind();
        Percussion p= new Percussion();
        Brass b = new Brass();
        Woodwind ww= new Woodwind();
        orchestra.addInstrument(wind);
        orchestra.addInstrument(p);
        orchestra.addInstrument(b);
        orchestra.addInstrument(ww);
        orchestra.addInstrument(new Stringed());
        orchestra.tuneAll();
    }
}
