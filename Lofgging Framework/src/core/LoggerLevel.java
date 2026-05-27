package core;

public enum LoggerLevel {
    INFO(1),
    DEBUG(2),
    WARN(3),
    ERROR(4);

    private final int priority;

    LoggerLevel(int priority) {
        this.priority = priority;
    }

    boolean isGreaterThan(LoggerLevel other) {
        return this.priority >= other.priority;
    }
}
