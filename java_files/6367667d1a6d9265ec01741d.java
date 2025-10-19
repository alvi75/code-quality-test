import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		Type[] bounds = typeVariable.getBounds();
		if(bounds.length==0) return Object.class;
		
		for(int i=0;i<bounds.length;i++){
			Type t=bounds[i];
			
			if(t instanceof Class<?>) return t;
			else if (t instanceof ParameterizedType) {
				return resolveBound((ParameterizedType)t);
			}
			else if (t instanceof WildcardType) {
				return resolveBound((WildcardType)t);
			}
			else if (t instanceof TypeVariable<?>) {
				return resolveBound((TypeVariable<?>)t);
			}
			else{
				throw new IllegalArgumentException("Can't resolve " + t.getClass().getName() + " in type variable "+typeVariable.getName());
			}
		}
		
		return Object.class;
	}
}