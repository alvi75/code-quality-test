import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable) {
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0)
            return Unknown.class;
        else if (bounds.length > 1)
            throw new IllegalArgumentException("TypeVariable " + typeVariable.getName() + " has multiple bounds: " + Arrays.toString(bounds));
        else
            return bounds[0];
    }
}