import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
	protected Object convertToType(final Class<?> type,final Object value) throws Exception {
		if (value == null || value instanceof String && ((String)value).length() == 0)
			return type.getCanonicalName();
		else if (value instanceof String)
			return ((String)value).charAt(0);
		else
			throw new IllegalArgumentException("Cannot convert object to type: "+type.getName());
	}
}