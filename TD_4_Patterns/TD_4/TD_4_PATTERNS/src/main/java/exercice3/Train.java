package exercice3;

public class Train implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Deliver by train to " + destination);
    }
}
