import java.util.*;

public class Translation426 {
    public byte[] grow() {
    assert bytesStart != null;
    bytesUsed.addAndGet(-bytesStart.length);
    bytesStart=ArrayUtil.grow(bytesStart, bytesStart.length+1);
    bytesUsed.addAndGet(bytesStart.length);
    return bytesStart;
}
}