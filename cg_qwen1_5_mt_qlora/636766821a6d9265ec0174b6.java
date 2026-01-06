import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        Type[] args = getParameterTypes(genericType);
        if(args == null || args.length != targetType.getTypeParameters().length)
            return null;
        else{
            Class<?>[] result = new Class[args.length];
            for(int i=0;i<args.length;++i)
                result[i] = resolveArgument(args[i],targetType.getTypeParameters()[i]);
            return result;
        }
    }
}