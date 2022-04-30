package exercice2;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Instrument> instruments = new ArrayList<Instrument>();
    public void tune(Instrument instrument){
        instrument.play();
    }

    public void tuneAll(){
        for(int i=0;i<instruments.size();i++) tune(instruments.get(i));
    }

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }
}
