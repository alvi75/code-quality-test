import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    /**Resolve and return the arguments for the genericType using the type variable information for the targetType. Returns null if  genericType is not parameterized or if arguments cannot be resolved.**/
	public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			Type[] args = ((ParameterizedType)genericType).getActualTypeArguments();
			Class<?>[] classes = new Class[args.length];
			for(int i=0;i<args.length;i++){
				Type arg = args[i];
				if(arg instanceof TypeVariable){
					TypeVariable<?> tv = (TypeVariable<?>)arg;
					classes[i] = resolveType(tv,targetType);
				}else{
					classes[i] = (Class<?>)arg;
				}
			}
			return classes;
		}
		return null;
	}
}