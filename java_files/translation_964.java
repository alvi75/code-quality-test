import java.util.*;

public class Translation964 {
    public ShortBuffer slice() {
    return new ShortArrayBuffer(remaining(), backingArray, offset + position);
}
}