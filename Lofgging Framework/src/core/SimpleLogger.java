package core;

public class SimpleLogger implements Logger {
    private LoggerLevel level;

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

    @Override
    public void setLogeLevel(int level) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLogeLevel'");
    }

    @Override
    public void setLoggerLevel(LoggerLevel level) {
        this.level = level;
    }

}
