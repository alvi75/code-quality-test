import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable) {
        Type[] bounds = typeVariable.getBounds();
        //The first bound is always present.
        Class<?> rawType = null;
        if (bounds[0] instanceof Class<?>) {
            rawType = ((Class<?>) bounds[0]).asSubclass(Object.class);
        } else if (bounds[0] instanceof ParameterizedType) {
            rawType = Types.erasure((ParameterizedType) bounds[0]);
        }
        if (rawType == null || rawType == Object.class) {
            for (int i = 1; i < bounds.length; i++) {
                if (bounds[i] instanceof Class<?>) {
                    rawType = ((Class<?>) bounds[i]).asSubclass(Object.class);
                } else if (bounds[i] instanceof ParameterizedType) {
                    rawType = Types.erasure((ParameterizedType) bounds[i]);
                }
                if (rawType != null && !rawType.equals(Object.class)) {
                    break;
                }
            }
        }

        return rawType == null ? Object.class : rawType;
    }
}