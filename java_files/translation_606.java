import java.util.*;

public class Translationtranslation_606 {
    public final void writeUnshared(Object object) throws IOException {
        writeObject(object);
        if (object instanceof SharedObject) {
            SharedObject so = (SharedObject) object;
            int numRefs = so.getNumberOfReferences();
            for (int i = 0;
            i < numRefs;
            i++) {
                writeShort(so.getReferenceAt(i));
            }
        }
    }
}