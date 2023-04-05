package exercise.connections;

// BEGIN
public class Disconnected implements Connection {
    private String state = "disconnected";

    @Override
    public String getState() {
        return state;
    }
}
// END
