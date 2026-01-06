import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		Type[] bounds = typeVariable.getBounds();
		if (bounds.length == 0) {
			return Object.class;
		}
		else if (bounds.length == 1) {
			return resolveType(bounds[0]);
		}
		else {
			throw new IllegalArgumentException("The type variable " + typeVariable.toString() + " has more than one bound.");
		}
	}
}