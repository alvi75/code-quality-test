import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    /**Resolve and return the arguments for the genericType using the type variable information for the targetType. Returns null if  genericType is not parameterized or if arguments cannot be resolved.*/
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        if(genericType instanceof ParameterizedType){
            Type[] actualTypeArguments=((ParameterizedType)genericType).getActualTypeArguments();
            Type[] formalTypeArguments=targetType.getTypeParameters();
            if(actualTypeArguments.length==formalTypeArguments.length){
                Class<?>[] args=new Class[actualTypeArguments.length];
                for(int i=0;i<args.length;i++){
                    args[i]=resolveArgument(actualTypeArguments[i],formalTypeArguments[i]);
                    if(args[i]==null)return null;
                }
                return args;
            }
        }
        return null;
    }
}