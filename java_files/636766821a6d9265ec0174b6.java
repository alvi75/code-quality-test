import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			Type[] actualTypeArguments = ((ParameterizedType)genericType).getActualTypeArguments();
			Class<?>[] argumentTypes = new Class[actualTypeArguments.length];
			for(int i=0;i<actualTypeArguments.length;i++){
				argumentTypes[i] = actualTypeArguments[i].getClass();
			}
			return argumentTypes;
		}else{
			return null;
		}
	}
}