import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        for (int i = 0; i < connections.size(); i++) {
            final TelnetConnection connection = connections.get(i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.write(message);
                    } catch (IOException e) {
                        // ignore
                    }
                }
            }).start();
        }
    }
}