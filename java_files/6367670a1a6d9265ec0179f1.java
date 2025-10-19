import java.util.*;

public class Generated_6367670a1a6d9265ec0179f1 {
    /**Convert an array of primitive shorts to objects.
@see #toPrimitive(short[])
@param array The array to convert.
@return An object array containing the converted values.
@since 1.0
*/
public static Short[] toObject(final short[] array){
return (array == null) ? null : Arrays.copyOf(array, array.length, Short[].class);
}
}