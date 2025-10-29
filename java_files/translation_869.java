import java.util.*;

public class Translation869 {
    public void write(int oneByte) throws IOException {
    if (oneByte < 0 || oneByte > 255) {
        throw new IllegalArgumentException("byte value out of range");
    }
    os.write(oneByte);
}
}