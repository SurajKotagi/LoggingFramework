public class SimpleLogger implements Logger {
    private LoggerType type;
    private int loggerLevel;

    @Override
    public void setLogeLevel(int level) {
        this.loggerLevel = level;
    }

    @Override
    public void setLogType(LoggerType type) {
        this.type = type;
    }

    @Override
    public void info(String messege) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'info'");
    }

    @Override
    public void debug(String messege) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'debug'");
    }

    @Override
    public void warn(String messege) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'warn'");
    }

    @Override
    public void error(String messege) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'error'");
    }

    @Override
    public void setOutputType(OutputType outputType) {
        this.setOutputType(outputType);
    }

}
