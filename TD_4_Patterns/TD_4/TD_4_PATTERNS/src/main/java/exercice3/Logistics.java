package exercice3;

public abstract class Logistics  {
    public void planDelivery(String destination){
        Transport t = createTransport();
        t.deliver(destination);
    }
    public abstract Transport createTransport();
}
