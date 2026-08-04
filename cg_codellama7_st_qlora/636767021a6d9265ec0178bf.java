import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type,final Object value) throws Exception {
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            final String string = (String) value;
            if (string.length() == 0) {
                return defaultValue;
            }
            return string.substring(0, 1);
        }
        return value;
    }
}