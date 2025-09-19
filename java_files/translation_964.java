import java.util.*;

public class Translation964 {
    public ShortBuffer slice() {
    return new ReadWriteShort(shorts, offset + position, remaining());
}
}