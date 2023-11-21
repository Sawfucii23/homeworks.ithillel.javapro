package homeworks.hw9;

public enum LoggingLevel {

    INFO(1),
    DEBUG(2);

    private int level;
    LoggingLevel(int level) {
        this.level = level;
    }
    public boolean isEnabled(LoggingLevel other) {

        return this.level >= other.level;
    }


}
