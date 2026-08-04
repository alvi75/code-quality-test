import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (packedField) {
            if (packedFieldCount == 0) {
                packedFieldCount = readRawVarint32();
            }
            packedFieldCount--;
            if (packedFieldCount == 0) {
                packedField = false;
            }
        }
    }
}