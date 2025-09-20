import java.util.*;

public class Translation964 {
    public ShortBuffer slice() {
    return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position);
}
}