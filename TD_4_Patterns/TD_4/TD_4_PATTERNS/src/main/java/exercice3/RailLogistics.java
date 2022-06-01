package exercice3;

public class RailLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
