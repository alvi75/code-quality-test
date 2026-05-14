import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    /**Resolve and return the arguments for the genericType using the type variable information for the targetType. Returns null if 
genericType is not parameterized or if arguments cannot be resolved.*/
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        if(genericType instanceof ParameterizedType){
            Type[] types = ((ParameterizedType)genericType).getActualTypeArguments();
            Class<?>[] classes = new Class[types.length];
            for(int i=0;i<classes.length;i++){
                classes[i] = (Class<?>)types[i];
            }
            return classes;
        }else{
            //if it's a class then we need to check that it has no type variables.
            if(!targetType.getTypeParameters().length==0){
                throw new IllegalArgumentException("Cannot resolve type parameters of "+targetType.getName());
            }
            return null;
        }
    }
}