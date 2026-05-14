import java.util.*;

public class Translation253 {
    34 public final short readUShort() throws IOException {
    final int ch1 = readUnsignedByte();
    final int ch2 = readUnsignedByte();
    return (short)((ch2 << 8) | (ch1 << 0));
}
}