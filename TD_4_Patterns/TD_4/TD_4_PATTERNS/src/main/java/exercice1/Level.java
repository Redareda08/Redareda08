package exercice1;

public enum Level {
    ERROR("ERROR"),
    WARNING("WARNING"),
    INFO("INFO"),
    DEBUG("DEBUG");

    private String levelValue;

    private Level(String levelValue) {
        this.levelValue = levelValue;
    }
    public String getLevelValue() {
        return levelValue;
    }

}
