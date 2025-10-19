import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    /**Resolve the class of the first bound for the typeVariable recursively,return Unknown.class if it can't be resolved.Otherwise return the bound.
@throws IllegalArgumentException if the typeVariable is not a parameterized type or has no bounds*/
public static Type resolveBound(TypeVariable<?> typeVariable) {
        Class<?> clazz = resolveClass(typeVariable);
        if (clazz == null)
            throw new IllegalArgumentException("TypeVariable " + typeVariable + " cannot be resolved");
        Type[] bounds = getBounds(clazz);
        if (bounds.length > 0)
            return bounds[0];
        else
            return Unknown.class;
    }
}