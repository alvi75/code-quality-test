import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		Type bound = typeVariable.getBounds()[0];
		if(bound instanceof Class<?>) {
			return (Class<?>)bound;
		}
		else if(bound instanceof ParameterizedType) {
			return ((ParameterizedType)bound).getRawType();
		}
		else if(bound instanceof TypeVariable<?>) {
			return resolveBound((TypeVariable<?>)bound);
		}
		else {
			return Object.class;
		}
	}
}