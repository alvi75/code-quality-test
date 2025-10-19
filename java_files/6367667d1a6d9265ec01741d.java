import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		if(typeVariable==null)
			return null;
		
		Type bound=typeVariable.getBound();
		if(bound instanceof Class<?>) {
			Class<?> clazz = (Class<?>)bound;
			if(clazz.isPrimitive()) {
				if(NumberUtils.isNumber(clazz)) {
					return NumberUtils.toType(clazz);
				}
				else {
					return String.valueOf(clazz);
				}
			}
			else {
				return clazz;
			}
		}
		else if(bound instanceof ParameterizedType) {
			ParameterizedType pt =(ParameterizedType)bound;
			Type[] types = pt.getActualTypeArguments();
			if(types.length>0) {
				bound=types[0];
			}
		}
		else{
			return Object.class;
		}
		
		return resolveBound(bound);
	}
}