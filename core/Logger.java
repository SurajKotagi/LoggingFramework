public interface Logger {
    void setOutputType(OutputType outputType);

    void setLogeLevel(int level);

    void setLogType(LoggerType type);

    void info(String messege);

    void debug(String messege);

    void warn(String messege);

    void error(String messege);
}
