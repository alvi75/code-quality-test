import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if (genericType instanceof ParameterizedType) {
			ParameterizedType p = (ParameterizedType) genericType;
			Type[] actualTypeArguments = p.getRawType().getTypeArguments();
			Class<?>[] argumentTypes = new Class[actualTypeArguments.length];
			for(int i=0;i<argumentTypes.length;i++){
				argumentTypes[i] = resolve(actualTypeArguments[i],targetType);
			}
			return argumentTypes;
		} else {
			return null;
		}
	}
}