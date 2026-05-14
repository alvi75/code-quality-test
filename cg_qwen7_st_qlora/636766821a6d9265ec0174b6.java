import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			Type[] types = ((ParameterizedType)genericType).getActualTypeArguments();
			Class<?>[] args = new Class[types.length];
			for(int i=0;i<args.length;i++){
				args[i] = (Class<?>)resolveArgument(types[i],targetType);
			}
			return args;
		}else{
			return null;
		}
	}
}