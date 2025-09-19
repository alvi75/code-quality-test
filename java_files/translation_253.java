import java.util.*;

public class Translation253 {
    public int readUShort() {
    int ch1 = _in.readUByte();
    int ch2 = _in.readUByte();
    return (ch2 << 8) + (ch1 << 0);
}
}