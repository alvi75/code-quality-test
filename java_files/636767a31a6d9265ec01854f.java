import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    private void checkIfPackedField() throws IOException {
        if (packedFields == null) {
            return;
        }
        int packedSize = packedFields.size();
        if (packedSize > 0) {
            // read the first field
            FieldInfo fi = packedFields.get(0);
            if (!fi.isPacked()) {
                throw new IOException("The field " + fi.getName() + " is not packed");
            }
            // read the rest fields
            for (int i = 1; i < packedSize; i++) {
                FieldInfo fi2 = packedFields.get(i);
                if (!fi2.isPacked()) {
                    throw new IOException("The field " + fi2.getName() + " is not packed");
                }
            }
        }
    }
}