import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
        Class<?> clazz = resolveClass(typeVariable);
        if(clazz==null)return Unknown.TYPE;
        else return clazz.getTypeParameters().get(0).getType();
    }
}