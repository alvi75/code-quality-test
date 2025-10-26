import java.util.*;

public class Translation964 {
    ublic ShortBuffer slice() {
    return new ReadWriteShortArrayBuffer(this, remaining(), backingArray, offset + position);
}
}