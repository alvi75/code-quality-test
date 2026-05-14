import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    public static int computeHash(Object o) {if (o == null)return 0;Class<?> c = o.getClass();if (c.isArray())return computeArrayHash(o);else if (c.isEnum())return computeEnumHash((Enum<?>) o);else return o.hashCode();}
}