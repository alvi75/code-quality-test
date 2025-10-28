import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type,final Object value) throws Exception {
        if (value == null || ((String)value).length() == 0)
            return getDefault(type);
        else
            return value;
    }
}