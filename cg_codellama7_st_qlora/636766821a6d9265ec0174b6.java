import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			ParameterizedType parameterizedType = (ParameterizedType)genericType;
			Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
			Class<?>[] resolvedArguments = new Class<?>[actualTypeArguments.length];
			for(int i=0;i<actualTypeArguments.length;i++){
				resolvedArguments[i] = resolveArgument(actualTypeArguments[i],targetType);
			}
			return resolvedArguments;
		}
		return null;
	}
}