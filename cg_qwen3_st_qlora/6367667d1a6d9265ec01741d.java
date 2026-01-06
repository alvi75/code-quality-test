import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    /**
 * Resolve the class of the first bound for the typeVariable recursively,return Unknown.class if it can't be resolved.Otherwise return the bound.
 **/
public static Type resolveBound(TypeVariable<?> typeVariable){
		if(typeVariable.getUpperBounds().length==0)
			return Unknown.class;
		Type[] bounds=typeVariable.getUpperBounds();
		for(int i=0;i<bounds.length;i++){
			if(bounds[i] instanceof Class<?>){
				return bounds[i];
			}else{
				return resolveBound((TypeVariable<?>)bounds[i]);
			}
		}
		return Unknown.class;
	}
}