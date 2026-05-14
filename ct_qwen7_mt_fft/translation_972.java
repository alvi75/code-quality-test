import java.util.*;

public class Translation972 {
    public void setBytesValue(BytesRef value) {
    if (!(fieldsData instanceof BytesRef)) {
        throw new IllegalArgumentException("cannot change value type from " + fieldsData.getClass().getSimpleName() + " to BytesRef");
    }
    if (value == null) {
        throw new NullPointerException();
    }
    bytesValue = value;
}
}