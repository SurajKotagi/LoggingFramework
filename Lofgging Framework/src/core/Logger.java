package core;

public interface Logger {
    void setOutputType(OutputType outputType);

    void setLogeLevel(int level);

    void setLoggerLevel(LoggerLevel level);

    void info(String messege);

    void debug(String messege);

    void warn(String messege);

    void error(String messege);
}
