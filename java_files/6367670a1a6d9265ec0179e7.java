import java.util.*;

public class Generated_6367670a1a6d9265ec0179e7 {
    public Converter lookup(final Class<?> clazz){
        if (clazz == null) {
            return null;
        }
        for (Converter converter : converters) {
            if (converter.getFrom().equals(clazz)) {
                return converter;
            }
        }
        return null;
    }
}