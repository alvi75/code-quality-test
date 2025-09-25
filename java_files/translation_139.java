import java.util.*;

public class Translation139 {
    public static TokenStream create(TokenStream input) {
    String className = null;
    try {
        className = props.getProperty(input.getClass().getName());
    }
    catch (Exception e) {
        throw new IllegalArgumentException("No class defined for field "+input.getClass().getName()+" in analyzer configuration",e);
    }
    if (className == null) {
        throw new IllegalArgumentException("Field '"+input.getClass().getName()+"' has no class configured");
    }
    Class<? extends TokenStream> clazz = null;
    try {
        clazz = Class.forName(className).asSubclass(TokenStream.class);
    }
    catch (ClassNotFoundException e) {
        throw new IllegalArgumentException("Analyzer class ["+className+"] not found.",e);
    }
    TokenStream result=null;
    try {
        result = clazz.getConstructor(String[].class).newInstance(new Object[]{
            args.toArray(new String[args.size()])}
            );
        }
        catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to instantiate token stream class "+clazz,e);
        }
        return result;
    }
}