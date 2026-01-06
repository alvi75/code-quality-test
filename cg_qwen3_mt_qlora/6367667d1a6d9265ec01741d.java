import java.util.*;

public class Generated_6367667d1a6d9265ec01741d {
    /**Resolve the class of the first bound for the typeVariable recursively,return Unknown.class if it can't be resolved.Otherwise return the bound.*/
    public static Type resolveBound(TypeVariable<?> typeVariable){
        if(typeVariable.getBounds().length==0)return Unknown.class;
        Type bound = typeVariable.getBounds()[0];
        if(bound instanceof Class) return bound;
        else if(bound instanceof ParameterizedType) {
            ParameterizedType ptype = (ParameterizedType)bound;
            Type[] actualTypeArguments = ((ParameterizedType) bound).getActualTypeArguments();
            Type[] typeParameters = ((ParameterizedType) bound).getActualTypeArguments();
            Type[] actualTypeArguments2 = new Type[typeParameters.length];
            for(int i=0;i<actualTypeArguments2.length;i++){
                actualTypeArguments2[i] = resolveBound((TypeVariable<?>)typeParameters[i]);
            }
            return new ParameterizedTypeImpl(ptype.getRawType(),actualTypeArguments2);
        }else if(bound instanceof WildcardType) {
            WildcardType wtype = (WildcardType)bound;
            Type[] actualTypeArguments = ((WildcardType) bound).getUpperBounds();
            Type[] typeParameters = ((WildcardType) bound).getLowerBounds();
            Type[] actualTypeArguments2 = new Type[typeParameters.length];
            for(int i=0;i<actualTypeArguments2.length;i++){
                actualTypeArguments2[i] = resolveBound((TypeVariable<?>)typeParameters[i]);
            }
            return new ParameterizedTypeImpl(wtype.getUpperBounds()[0],actualTypeArguments2);
        }else{
            throw new RuntimeException("Unknown bound type");
        }
    }
}