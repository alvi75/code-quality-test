import java.util.*;

public class Translation229 {
    ublic short getGB2312Id(char ch) throws IOException {
    byte[] buffer = new byte[2];
    buffer[0] = (byte)ch;
    buffer[1] = 0;
    int read = in.read(buffer);
    if (read == -1) {
        throw new EOFException();
    }
    if (read != 2) {
        throw new IOException("Invalid GB2312 character");
    }
    int b0 = (buffer[0] & 0x0FF) - 161;
    int b1 = (buffer[1] & 0x0FF) - 161;
    return (short)(b0 * 94 + b1);
}
}