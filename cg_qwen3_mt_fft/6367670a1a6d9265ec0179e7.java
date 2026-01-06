import java.util.*;

public class Generated_6367670a1a6d9265ec0179e7 {
    public Converter lookup(final Class<?> clazz){
		if (clazz == null) {
			throw new IllegalArgumentException("Class must not be null.");
		}
		
		for (Converter c : converters) {
			if (c.canConvert(clazz)) {
				return c;
			}
		}
		
		return null;
	}
}