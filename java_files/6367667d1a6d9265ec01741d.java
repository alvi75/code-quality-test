import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    public static Type resolveBound(TypeVariable<?> typeVariable){
		if(typeVariable.getBounds().length==0)
			return Object.class;
		else{
			Type type=typeVariable.getBounds()[0];
			if(type instanceof Class)
				return (Class<?>)type;
			else if(type instanceof ParameterizedType){
				ParameterizedType parameterizedType=(ParameterizedType)type;
				Type[] types=parameterizedType.getActualTypeArguments();
				for(int i=0;i<types.length;i++){
					Type actualType=resolveBound((TypeVariable<?>)types[i]);
					if(actualType!=Unknown.class)
						return actualType;
				}
			}else if(type instanceof WildcardType){
				WildcardType wildcardType=(WildcardType)type;
				Type[] upperBounds=wildcardType.getUpperBounds();
				for(int i=0;i<upperBounds.length;i++){
					Type actualType=resolveBound((TypeVariable<?>)upperBounds[i]);
					if(actualType!=Unknown.class)
						return actualType;
				}
			}
			return Unknown.class;
		}
	}
}