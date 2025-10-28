import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    /**Check if the field should be packed,if so,read the field and update the internal state. It will throw an exception when the process of reading is wrong.**/
    private void checkIfPackedField() throws IOException {
        if (packedFields == null) {
            return;
        }
        int length = packedFields.length();
        if (length < 2) {
            throw new IOException("Invalid packed field size: " + length);
        }
        int offset = packedFields[0];
        int type = packedFields[1];
        if (offset < 0 || offset > data.length()) {
            throw new IOException("Invalid packed field offset: " + offset);
        }
        if (type != 0 && type != 1) {
            throw new IOException("Invalid packed field type: " + type);
        }
        if (type == 0) {
            // unpacked field
            unpackedField(offset, length);
        } else {
            // packed field
            packedField(offset, length);
        }
    }
}