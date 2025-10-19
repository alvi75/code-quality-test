import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (packed) {
            //check if the field is packed
            int type = in.readUnsignedByte();
            if (type == 0) {
                packed = false;
            } else if (type == 1) {
                packed = true;
            } else {
                throw new IOException("Invalid packed field type");
            }
        }
    }
}