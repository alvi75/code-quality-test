import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    /** Check if the field should be packed,if so,read the field and update the internal state. It will throw an exception when the process of reading is wrong.
 * @throws IOException */
    private void checkIfPackedField() throws IOException {
        //check if it's a packed field
        if (packedFields.contains(field)) {
            int length = readInt();
            if (length < 0) {
                throw new IOException("Invalid packed field length");
            }
            byte[] data = new byte[length];
            readFully(data);
            Object value = unpackValue(data);
            setFieldValue(value);
        } else {
            //not packed field, just read the field
            Object value = readObject();
            setFieldValue(value);
        }
    }
}