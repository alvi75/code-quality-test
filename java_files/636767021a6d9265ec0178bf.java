import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type, final Object value) throws Exception {
        if (value == null || "".equals(value)) {
            return null;
        }
        String[] values = StringUtils.split(value.toString(), ",");
        if (values.length > 0 && !"".equals(values[0])) {
            return Integer.parseInt(values[0]);
        } else {
            return super.convertToType(type, value);
        }
    }
}