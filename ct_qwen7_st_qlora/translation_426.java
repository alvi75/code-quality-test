import java.util.*;

public class Translation426 {
    public byte[][] grow() {
    assert bytesStart != null;
    bytesStart = ArrayUtil.grow(bytesStart, bytesEnd.length+1);
    bytesEnd = ArrayUtil.grow(bytesEnd, bytesEnd.length+1);
    assert bytesStart.length == bytesEnd.length;
    return bytesStart;
}
}