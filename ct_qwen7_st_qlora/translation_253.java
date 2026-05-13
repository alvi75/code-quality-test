import java.util.*;

public class Translation253 {
    public final int readUShort() throws IOException {
    int ch1 = readUnsignedByte();
    int ch2 = readUnsignedByte();
    return (ch2 << 8) + (ch1 << 0);
}
}