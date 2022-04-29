package exercice1;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Wind> wind = new ArrayList<Wind>();
    private ArrayList<Percussion> percussion = new ArrayList<Percussion>();

    public void tuneWind(Wind wind){
        wind.play();
    }

    public void tunePercussion(Percussion percussion){
        percussion.play();
    }

    public void tuneAll(){
        for(int i=0;i< wind.size();i++) tuneWind(wind.get(i));
        for(int i=0;i< percussion.size();i++) tunePercussion(percussion.get(i));

    }

    public void addWind(Wind w){
        wind.add(w);
    }

    public void addPercussion(Percussion p){
        percussion.add(p);
    }
}
