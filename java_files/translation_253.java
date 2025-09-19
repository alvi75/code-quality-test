import java.util.*;

public class Translation253 {
    public final int readUShort() {
    int ch1 = readUByte();
    int ch2 = readUByte();
    int ch3 = readUByte();
    int ch4 = readUByte();
    return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0);
}
}