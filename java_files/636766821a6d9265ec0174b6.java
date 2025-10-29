import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    /**Resolve and return the arguments for the genericType using the type variable information for the targetType. Returns null if  genericType is not parameterized or if arguments cannot be resolved.**/
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        if(genericType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType)genericType).getActualTypeArguments();
            if(actualTypeArguments.length == 0){
                return null;
            }
            else{
                Class<?>[] args = new Class[actualTypeArguments.length];
                for(int i=0;i<args.length;i++){
                    args[i] = resolveArguments(actualTypeArguments[i],targetType);
                }
                return args;
            }
        }
        else if(genericType instanceof GenericArrayType){
            Type[] actualTypeArguments = ((GenericArrayType)genericType).getGenericComponentType().getType();
            if(actualTypeArguments.length == 0){
                return null;
            }
            else{
                Class<?>[] args = new Class[actualTypeArguments.length];
                for(int i=0;i<args.length;i++){
                    args[i] = resolveArguments(actualTypeArguments[i],targetType);
                }
                return args;
            }
        }
        else if(genericType instanceof WildcardType){
            Type[] upperBounds = ((WildcardType)genericType).getUpperBounds();
            if(upperBounds.length == 0){
                return null;
            }
            else{
                Class<?>[] args = new Class[upperBounds.length];
                for(int i=0;i<args.length;i++){
                    args[i] = resolveArguments(upperBounds[i],targetType);
                }
                return args;
            }
        }
        else if(genericType instanceof TypeVariable){
            TypeVariable<?> var = (TypeVariable<?>) genericType;
            String name = var.getName();
            if(name.equals("T")){
                return null;
            }
            else{
                return new Class[]{resolveArguments(((TypeVariable<?>) genericType).getBounds(),targetType)};
            }
        }
        else{
            throw new IllegalArgumentException("Unsupported generic type: " + genericType);
        }
    }
}