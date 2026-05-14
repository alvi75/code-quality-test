import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    /**Resolve the class of the first bound for the typeVariable recursively,return Unknown.class if it can't be resolved.Otherwise return the bound.**/
    public static Type resolveBound(TypeVariable<?> typeVariable){
        Type[] bounds = typeVariable.getBounds();
        if(bounds.length == 0) {
            return Unknown.class;
        }
        return resolveBound(bounds[0]);
    }
}