import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    /**
 * Resolve and return the arguments for the genericType using the type variable information for the targetType. Returns null if  genericType is not parameterized or if arguments cannot be resolved.
 **/
public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType){
			Type[] actualTypes=((ParameterizedType)genericType).getActualTypeArguments();
			Class<?>[] types=new Class[actualTypes.length];
			for(int i=0;i<types.length;i++){
				types[i]=resolveArgument(actualTypes[i],targetType);
			}
			return types;
		}else{
			return null;
		}
	}
}