import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
        final long value = readLong();
        if(value < 0){
            throw new IllegalStateException("Negative long value: " + value);
        }
        return value;
    }
}