import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		Type[] bounds = typeVariable.getBounds();
		if(bounds!=null && bounds.length>0)
			return bounds[0];
		else
			return UnknownType.getInstance();
	}
}