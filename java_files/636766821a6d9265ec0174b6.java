import java.util.*;

public class Generated_636766821a6d9265ec0174b6 {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
        if(genericType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType)genericType).getActualTypeArguments();
            Class<?>[] classes = new Class[actualTypeArguments.length];
            for(int i=0;i<actualTypeArguments.length;i++){
                Type type = actualTypeArguments[i];
                if(type instanceof Class){
                    classes[i] = (Class<?>)type;
                }else if(type instanceof TypeVariable){
                    TypeVariable<?> tv = (TypeVariable<?>)type;
                    Type[] bounds = tv.getBounds();
                    if(bounds.length==1 && bounds[0].equals(Object.class)){
                        //if there is only one bound and it is Object then we can use the genericType as the argument
                        classes[i] = (Class<?>)tv.getGenericDeclaration().getTypeParameters()[i].getClass();
                    }else{
                        //otherwise we need to find the class that implements the interface
                        for(Class<?> c : targetType.getClasses()){
                            if(c.isInterface() && bounds[0].equals(c)){
                                classes[i] = c;
                                break;
                            }
                        }
                    }
                }
            }
            return classes;
        }
        return null;
    }
}