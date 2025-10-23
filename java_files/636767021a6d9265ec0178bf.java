import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type, final Object value) throws Exception {
        if (value == null || "".equals(value)) {
            return defaultValue;
        }
        String[] values = ((String) value).split(",");
        if (values.length > 1) {
            return values[0];
        } else {
            return defaultValue;
        }
    }
}