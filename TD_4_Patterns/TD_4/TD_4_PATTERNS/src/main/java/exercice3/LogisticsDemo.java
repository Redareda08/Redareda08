package exercice3;

public class LogisticsDemo {
    public static void main(String[] args){
        Logistics rl = new RoadLogistics();
        rl.planDelivery("Kiev");
        Logistics sl = new SeaLogistics();
        sl.planDelivery("Odessa");
        Logistics Rl = new RailLogistics();
        Rl.planDelivery("Lviv");

    }
}
