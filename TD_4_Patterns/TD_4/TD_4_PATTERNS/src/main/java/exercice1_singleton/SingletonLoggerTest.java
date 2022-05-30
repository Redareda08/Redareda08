package exercice1_singleton;

import exercice1.Level;
import exercice1_singleton.SingletonFileLogger;

public class SingletonLoggerTest {
    public static void main(String[] args){
        ILogger logger = SingletonFileLogger.getInstance();
        logger.write(Level.ERROR, "erreur test singleton");
        logger.write(Level.WARNING, "warning test singleton 1111");
    }
}
