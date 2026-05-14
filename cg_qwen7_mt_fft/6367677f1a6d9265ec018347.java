import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        for(TelnetConnection connection : telnetConnections){
            if(connection != null && connection.isOpen()){
                connection.writeLine(message);
            }
        }
    }
}