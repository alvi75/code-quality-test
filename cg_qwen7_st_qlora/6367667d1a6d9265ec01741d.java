import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		Type[] bounds = typeVariable.getBounds();
		if(bounds.length==0) {
			return Object.class;
		}
		Type bound = bounds[0];
		if(bound instanceof Class<?>) {
			return (Class<?>)bound;
		}else if(bound instanceof ParameterizedType){
			return ((ParameterizedType)bound).getRawType();
		}else{
			return Unknown.class;
		}
	}
}