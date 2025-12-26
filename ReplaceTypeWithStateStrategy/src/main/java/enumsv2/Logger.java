package enumsv2;

public class Logger {
    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;

    private State _state;

    public Logger() {

        setState(State.STATE_STOPPED);
    }

    public void start(){
        _state.start();
        setState(State.STATE_LOGGING);
    }

    public State getState(){
        return _state;
    }

    public void setState(State state){
        _state = state;
    }

    public void stop(){
        _state.stop();
        setState(State.STATE_STOPPED);
    }

    public void log(String info){
        _state.log(info);
    }
}
