import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    /**Check if the field should be packed,if so,read the field and update the internal state. It will throw an exception when the process of reading is wrong.**/
    private void checkIfPackedField() throws IOException {
        if (packed) {
            int type = readByte();
            if ((type & 0x80) == 0x80) {
                // this is a packed field
                int length = (type & 0x7f);
                if (length > 0) {
                    // read the value
                    byte[] value = new byte[length];
                    readFully(value);
                    // update the internal state
                    unpacked = false;
                    packed = false;
                    packedLength = 0;
                    packedValue = value;
                }
            } else {
                // this is not a packed field
                unpacked = true;
                packed = false;
                packedLength = 0;
                packedValue = null;
            }
        }
    }
}