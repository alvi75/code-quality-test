import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        int type = readByte();
        if (type == 0) {
            //packed field
            int length = readShort();
            byte[] data = new byte[length];
            readFully(data);
            unpackedFields.put(type, data);
        } else {
            //not packed field
            int length = readInt();
            byte[] data = new byte[length];
            readFully(data);
            unpackedFields.put(type, data);
        }
    }
}