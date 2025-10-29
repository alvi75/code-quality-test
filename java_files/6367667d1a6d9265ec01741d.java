import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable) {Type result = null;for (Type bound : typeVariable.getBounds()) {result = resolve(bound);if (result != null) {break;}}return result;}
}