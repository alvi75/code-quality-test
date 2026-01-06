import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
		if(genericType instanceof ParameterizedType) {
			Type[] actualArgs = ((ParameterizedType)genericType).getActualTypeArguments();
			Map<String, Type> typeVariables = getTypeVariables(targetType);
			List<Type> args = new ArrayList<>();
			for (Type actualArg : actualArgs) {
				args.add(resolveType(actualArg,typeVariables));
			}
			return args.toArray(new Class[args.size()]);
		} else {
			return null;
		}
	}
}