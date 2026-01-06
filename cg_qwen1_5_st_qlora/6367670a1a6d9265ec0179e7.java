import java.util.*;

public class Generated_6367670a1a6d9265ec0179e7 {
    public Converter lookup(final Class<?> clazz){
        if (clazz == null) {
            return null;
        }
        final String key = clazz.getName();
        final Converter converter = converters.get(key);
        if (converter != null) {
            return converter;
        } else {
            return null;
        }
    }
}