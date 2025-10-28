import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			Type[] actualTypeArguments = ((ParameterizedType)genericType).getActualTypeArguments();
			Class<?>[] argumentTypes = new Class[actualTypeArguments.length];
			for(int i=0;i<argumentTypes.length;i++){
				argumentTypes[i] = resolveArgument(actualTypeArguments[i],targetType);
			}
			return argumentTypes;
		}
		else{
			throw new IllegalArgumentException("Cannot resolve generic type " + genericType);
		}
	}
}