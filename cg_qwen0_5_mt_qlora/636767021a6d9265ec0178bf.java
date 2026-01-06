import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    /**If the length of the value string is 0, the default type is returned. Otherwise, the element at the first position of the string is returned.**/
    @Override
    protected Object convertToType(final Class<?> type, final Object value) throws Exception {
        if (value == null || "".equals(value)) {
            return defaultValue;
        }
        return super.convertToType(type, value);
    }
}