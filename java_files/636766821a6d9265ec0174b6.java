import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        if(genericType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType)genericType).getActualTypeArguments();
            if(actualTypeArguments.length == 0){
                return null;
            }
            else{
                Class<?>[] argumentTypes = new Class<?>[actualTypeArguments.length];
                for(int i=0;i<argumentTypes.length;i++){
                    argumentTypes[i] = resolveType(actualTypeArguments[i],targetType);
                }
                return argumentTypes;
            }
        }
        return null;
    }
}