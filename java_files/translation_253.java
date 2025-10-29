import java.util.*;

public class Translation253 {
    public int readUnsignedShort() {
    final int ch1 = readByte();
    final int ch2 = readByte();
    return (ch2 << 8) + (ch1 << 0);
}
}