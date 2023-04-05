package exercise;

import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

// BEGIN
public class TcpConnection {
    private String ip;
    private int port;

    private Connection connection = null;

    public TcpConnection(String i, int p) {
        ip = i;
        port = p;
    }

    public String getCurrentState() {
        return connection.getState();
    }

    public void connect() {
        if (connection != null && getCurrentState().equals("connected")) {
            System.out.println("Error! Connection already established");
        } else {
            connection = new Connected();
        }
    }

    public void disconnect() {
        if (connection == null || getCurrentState().equals("disconnected")) {
            System.out.println("Error! Connection already disconnected");
        } else {
            connection = new Disconnected();
        }
    }

    public void write(String message) {
        if (connection == null || !getCurrentState().equals("connected")) {
            System.out.println("Error! Connection closed");
        } else {
            System.out.println(message);
        }
    }

}
// END
