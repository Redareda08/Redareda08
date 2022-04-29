package exercice1;

public class Music {
    public static void main(String[] args){
        Orchestra orchestra = new Orchestra();
        Wind wind = new Wind();
        Percussion p= new Percussion();
        Brass b = new Brass();
        Woodwind ww= new Woodwind();
        orchestra.addPercussion(p);
        orchestra.addWind(wind);
        orchestra.addWind(ww);
        orchestra.addWind(b);
        orchestra.tuneAll();
    }
}
