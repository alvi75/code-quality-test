import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode(){
        if (type == null) return 0;
        else if (type.equals("int")) return Integer.parseInt(value);
        else if (type.equals("long")) return Long.parseLong(value);
        else if (type.equals("float")) return Float.parseFloat(value);
        else if (type.equals("double")) return Double.parseDouble(value);
        else if (type.equals("boolean")) return Boolean.parseBoolean(value);
        else if (type.equals("char")) return Character.codePointAt(value, 0);
        else if (type.equals("short")) return Short.parseShort(value);
        else if (type.equals("byte")) return Byte.parseByte(value);
        else if (type.equals("string")) return value.hashCode();
        else throw new RuntimeException("Unknown type: "+type);
    }
}