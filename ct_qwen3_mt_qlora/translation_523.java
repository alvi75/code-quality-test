import java.util.*;

public class Translation523 {
    ublic void flush() throws IOException {
    if (closed) throw new IOException("Attempt to write to closed Writer");
    if (buffered < buffer.length) return;
    writeBuffer();
}
}