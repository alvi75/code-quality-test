import java.util.*;

public class Translationtranslation_566 {
    public BytesRef getBinaryValue(String name) {
        for (IndexableField field : fields) {
            if (field.name().equals(name)) {
                final BytesRef bytes = field.binaryValue();
                if (bytes != null) {
                    return bytes;
                }
            }
        }
    }
    }
    }
    return null;
    }
}