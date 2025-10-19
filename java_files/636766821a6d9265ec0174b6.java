import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			Type[] typeArguments = ((ParameterizedType)genericType).getActualTypeArguments();
			Class<?>[] args = new Class[typeArguments.length];
			for(int i=0;i<typeArguments.length;i++){
				args[i] = resolveArguments(typeArguments[i],targetType);
			}
			return args;
		}else{
			return null;
		}
	}
}