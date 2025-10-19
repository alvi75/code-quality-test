import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event)
    {
        if (event == null) return;
        
        synchronized(this)
        {
            //add to the end of the list
            m_buffer.add(event);
            
            //if we have reached the maximum size, remove the oldest entry
            if(m_buffer.size() > MAX_SIZE)
                m_buffer.remove(0);
        }
    }
}