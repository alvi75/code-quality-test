import java.util.*;

public class Translation964 {
    1 public ShortBuffer slice() {
    2 return new ReadWriteShortArrayBuffer(remaining(), backingArray,offset + position);
}
}