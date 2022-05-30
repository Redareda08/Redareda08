package exercice1;

public class StaticLoggerTest {
    public static void main(String[] args){
        Level l = Level.WARNING;
        StaticLogger.write(Level.WARNING, "mon programme se comporte bizarrement");
    }
}
