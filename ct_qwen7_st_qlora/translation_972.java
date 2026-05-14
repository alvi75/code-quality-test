import java.util.*;

public class Translation972 {
    public void setBytesValue(BytesRef value) {
    if (value == null) {
        setValue(null);
    }
    else {
        bytes = new byte[value.length];
        System.arraycopy(value.bytes, value.offset, bytes, 0, value.length);
        setNullValue(false);
    }
}
}