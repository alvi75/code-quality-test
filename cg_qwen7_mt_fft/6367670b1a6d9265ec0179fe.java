import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    public void write(byte b[]) throws IOException {
        if (TraceComponent.isAnyTracingEnabled()&&logger.isLoggable (Level.FINE))  //306998.15
            logger.logp(Level.FINE, CLASS_NAME,"write", "write len --> "+b.length); 
        int newcount = count + b.length;
        if (newcount > buf.length) {
            buf = Arrays.copyOf(buf,newcount);
        }
        System.arraycopy(b, 0, buf, count, b.length);
        count = newcount;
    }
}