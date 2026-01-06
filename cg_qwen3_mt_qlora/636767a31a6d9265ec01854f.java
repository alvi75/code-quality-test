import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (isPackedField) {
            int length = readUnsignedShort();
            if (length > 0) {
                byte[] data = new byte[length];
                in.readFully(data);
                String value = new String(data, "UTF-8");
                if (value.equals("true")) {
                    isPackedField = true;
                } else {
                    throw new IOException("The value of packed field must be 'true'");
                }
            } else {
                isPackedField = false;
            }
        }
    }
}