import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (isPackedField) {
            int length = readUnsignedInt();
            if (length > 0) {
                byte[] bytes = new byte[length];
                readFully(bytes);
                unpackedBytes.add(bytes);
            }
        } else {
            unpackedBytes.add(readBytes());
        }
    }
}