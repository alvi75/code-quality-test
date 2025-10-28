import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        TypeVariable< ? >[] variables = targetType.getTypeParameters();
        int numVariables = variables.length;
        if(numVariables == 0) {
            return null; // no parameters to resolve
        }
        
        Type[] args = ((ParameterizedType)genericType).getActualTypeArguments(); 
        if(args.length != numVariables) {
            return null; // wrong number of arguments
        }

        Class<?>[] result = new Class<?>[numVariables];
        for(int i=0;i<numVariables;++i) {
            Type arg = args[i];
            if(arg instanceof ParameterizedType) {
                result[i] = (Class<?>)((ParameterizedType)arg).getRawType();
            } else {
                result[i] = (Class<?>)arg;
            }
        }
        return result;
    }
}