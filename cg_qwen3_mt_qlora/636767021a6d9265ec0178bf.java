import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type,final Object value) throws Exception {
        if (value == null || ((String) value).length() == 0) {
            return getDefault(type);
        }
        final String[] values = ((String) value).split(",");
        if (values.length > 1) {
            throw new IllegalArgumentException("Multiple values not allowed for " + type.getName());
        }
        return super.convertToType(type, values[0]);
    }
}