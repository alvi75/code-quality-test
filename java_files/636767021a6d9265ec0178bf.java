import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type,final Object value) throws Exception {
        if (value == null) {
            return null;
        }
        final String stringValue = value.toString();
        if (stringValue.length() == 0) {
            return getDefaultValue(type);
        } else {
            return stringValue.charAt(0);
        }
    }
}