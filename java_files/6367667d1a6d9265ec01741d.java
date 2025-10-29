import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
        Type[] bounds = typeVariable.getBounds();
        if(bounds.length==0) return Unknown.class;
        else{
            Type bound = bounds[0];
            if(bound instanceof TypeVariable) return resolveBound((TypeVariable<?>)bound);
            else return bound;
        }
    }
}