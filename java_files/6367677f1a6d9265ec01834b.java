import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o)
    {
        if (o == null) return;
        synchronized(this)
        {
            //if we have reached the end of the buffer, roll over to the next one.
            if (count >= buffer.length)
            {
                count = 0;
                buffer = new LoggingEvent[bufferSize];
            }
            
            buffer[count] = o;
            count++;
        }
    }
}