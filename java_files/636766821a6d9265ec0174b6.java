import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        if(genericType instanceof ParameterizedType) {
            ParameterizedType ptype = (ParameterizedType)genericType;
            Type[] args = ptype.getActualTypeArguments();
            List<Class<?>> argClasses = new ArrayList<>();
            for(int i=0;i<args.length;++i){
                Type argType = args[i];
                if(argType instanceof WildcardType){
                    //TODO: handle wildcards
                    continue;
                }
                if(argType instanceof GenericArrayType){
                    //TODO: handle generics arrays
                    continue;
                }
                if(argType instanceof Class<?>) {
                    argClasses.add((Class<?>)argType);
                } else if(argType instanceof ParameterizedType){
                    //TODO: handle nested types
                    continue;
                } else if(argType instanceof TypeVariable<?>) {
                    TypeVariable<?> tv = (TypeVariable<?>)argType;
                    String name = tv.getName();
                    TypeVariable<?>[] vars = targetType.getTypeParameters();
                    int index = Arrays.asList(vars).indexOf(tv);
                    if(index >= 0 && index < args.length) {
                        argClasses.add(args[index]);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot resolve argument of type "+argType.getClass().getName());
                }
            }
            return argClasses.toArray(new Class[argClasses.size()]);
        }
        return null;
    }
}