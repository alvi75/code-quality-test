import java.util.*;

public class Translation253 {
    public int readUShort() {
    int ch1 = readUByte();
    int ch2 = readUByte();
    return (ch2 << 8) + (ch1 << 0);
}
}