import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
	protected Object convertToType(final Class<?> type, final Object value)
			throws Exception {
		if (value == null || "".equals(value)) {
			return null;
		}
		final String str = value.toString();
		if (str.length() == 0) {
			return null;
		}
		return super.convertToType(type, str);
	}
}