import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    /**
 * Check if the field should be packed,if so,read the field and update the internal state. It will throw an exception when the process of reading is wrong.
 */
    private void checkIfPackedField() throws IOException {
        if (isPackedField()) {
            int length = readUnsignedShort();
            byte[] data = new byte[length];
            readFully(data);
            unpackedData.put(fieldIndex, data);
        }
    }
}