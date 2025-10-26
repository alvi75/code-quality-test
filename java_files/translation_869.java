import java.util.*;

public class Translation869 {
    ublic void write(int oneByte) throws IOException {
    if (oneByte < 0 || oneByte > 255) {
        throw new IllegalArgumentException("byte is out of range");
    }
    write((byte)oneByte);
}
}