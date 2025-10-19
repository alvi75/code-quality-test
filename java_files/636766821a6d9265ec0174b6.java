import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			ParameterizedType ptype = (ParameterizedType)genericType;
			Type[] actualTypeArgs = ptype.getActualTypeArguments();
			Class<?>[] args = new Class<?>[actualTypeArgs.length];
			for(int i=0;i<args.length;i++){
				args[i] = (Class<?>)actualTypeArgs[i];
			}
			return args;
		}
		return null;
	}
}