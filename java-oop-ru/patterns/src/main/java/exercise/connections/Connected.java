package exercise.connections;

// BEGIN
public class Connected implements Connection {
    private String state = "connected";

    @Override
    public String getState() {
        return state;
    }
}
// END
