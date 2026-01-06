import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable) {
        Type bound = typeVariable.getGenericDeclaration();
        while (bound instanceof TypeVariable<?>) {
            TypeVariable<?> tvar = (TypeVariable<?>) bound;
            bound = tvar.getGenericDeclaration();
        }
        return bound;
    }
}