import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (isPackedField()) {
            int length = readInt();
            if (length < 0) {
                throw new IOException("Invalid packed field length: " + length);
            }
            if (length > 0) {
                byte[] bytes = new byte[length];
                in.read(bytes);
                value = bytes;
            } else {
                value = null;
            }
        }
    }
}