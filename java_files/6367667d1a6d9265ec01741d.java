import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		if(typeVariable.isBound()){
			return resolveBound(typeVariable.getUpperBound());
		}
		else{
			return typeVariable;
		}
	}
}