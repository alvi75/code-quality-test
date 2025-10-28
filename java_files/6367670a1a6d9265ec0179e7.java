import java.util.*;

public class Generated_6367670a1a6d9265ec0179e7 {
    public Converter lookup(final Class<?> clazz) {
        for (final Converter c : converters) {
            if (c.getClass().equals(clazz)) {
                return c;
            }
        }
        return null;
    }
}