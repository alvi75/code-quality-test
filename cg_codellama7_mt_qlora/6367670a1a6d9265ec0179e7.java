import java.util.*;

public class Generated_6367670a1a6d9265ec0179e7 {
    public Converter lookup(final Class<?> clazz) {
        for (final Converter converter : converters) {
            if (converter.canConvert(clazz)) {
                return converter;
            }
        }
        return null;
    }
}