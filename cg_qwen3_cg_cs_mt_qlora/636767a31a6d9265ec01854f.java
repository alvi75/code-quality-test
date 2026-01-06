import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (isPackedField()) {
            int length = readUnsignedShort();
            byte[] data = new byte[length];
            readFully(data);
            unpackedData.put(field, data);
        }
    }
}